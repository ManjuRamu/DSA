let arr = [
  ["a", "b"],
  [0, 0, 0],
  [1, 1, 1],
];
// for (let i = 0; i < arr.length; i++) {
//   for (let j = 0; j < arr[i].length; j++) {
//   console.log(arr[i][j])
//   }
// }

function print(arr, i, j) {
  if (i >= arr.length) return;
   console.log(arr[i][j]);
  if (j == arr[i].length -1) {
    print(arr,i + 1, 0);
  } else {
    print(arr,i, j + 1);
  }
}
print(arr, 0, 0);


