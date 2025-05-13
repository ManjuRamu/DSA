const arr = [
  [1, 2, 4, 6],
  [1, 0, 4, 6],
  [1, 0, 0, 6],
  [1, 2, 1, 2],
];

function shortestPath(arr, i, j, sum, res) {
  if (i >= arr.length - 1 && j >= arr[i].length - 1) {
    {
      const total = sum + arr[i][j];
      if (total < res) {
        res = total;
      }
    }
    console.log(res)
    return res;
  }
  sum += arr[i][j];
  if (j >= arr[i].length - 1) {
    shortestPath(arr, i + 1, j, sum, res);
  } else if (i >= arr.length - 1) {
    shortestPath(arr, i, j + 1, sum, res);
  } else {
    shortestPath(arr, i, j + 1, sum, res);
    shortestPath(arr, i + 1, j, sum, res);
  }
 return res;
}
const res = [];
console.log(shortestPath(arr, 0, 0, 0, Infinity))

