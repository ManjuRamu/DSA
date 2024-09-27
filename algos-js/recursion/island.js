let land = [
  [1, 1, 0, 1],
  [1, 1, 1, 1],
  [0, 1, 0, 1],
  [1, 0, 0, 1],
];
function islands(arr, i, j) {
  if (
    i >= arr.length ||
    j >= arr[i]?.length ||
    arr[i]?.[j] == 0 ||
    i < 0 ||
    j < 0
  ) {
    return 0;
  }

  arr[i][j] = 0;
  return (
    1 +
    islands(arr, i, j + 1) +
    islands(arr, i + 1, j) +
    islands(arr, i, j - 1) +
    islands(arr, i - 1, j)
  );
}
let res = [];
for (let i = 0; i < land.length; i++) {
  for (let j = 0; j < land[i].length; j++) {
    res.push(islands(land, i, j));
  }
}
console.log(res);
