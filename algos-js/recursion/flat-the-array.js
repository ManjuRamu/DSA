let arr = ["z",
  ["a", "b", "c"],
  [1, 2, 4, ["A", "b", [0, 0]]],
];
let result = [];
function flat(arr, i, result) {
  if (i >= arr.length) return;
  if (Array.isArray(arr[i])) {
    flat(arr[i] ,0, result);
  } else {
    result.push(arr[i]);
  }
  flat(arr, i+1, result);
}
flat(arr, 0, result);
console.log(result);
