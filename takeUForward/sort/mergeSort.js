/*
divide and merge the in sorted format
*/
function sort() {
  const arr = [9, 8, 7, 6, 5, 4, 3, 2, 1];
  mergeSort(arr, 0, arr.length - 1);
  console.log(arr);
}
function mergeSort(arr, low, high) {
  if (low === high) return;
  const mid = parseInt((low + high) / 2);
  mergeSort(arr, low, mid);
  mergeSort(arr, mid + 1, high);
  linearSort(arr, low, mid, high);
}
function linearSort(arr, low, mid, high) {
  const temp = [];
  let i = low,
    j = mid + 1;
  while (i <= mid && j <= high) {
    if (arr[i] > arr[j]) {
      temp.push(arr[j]);
      j++;
    } else {
      temp.push(arr[i]);
      i++;
    }
  }
  while (i <= mid) {
    temp.push(arr[i]);
    i++;
  }
  while (j <= high) {
    temp.push(arr[j]);
    j++;
  }
  for (let i = 0; i < temp.length; i++) {
    arr[low++] = temp[i];
  }
}
sort();
