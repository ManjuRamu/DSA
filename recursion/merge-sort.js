let arr = [20, 10, 5, 2, -1, 55,20];

function mergeSort(arr, start = 0, end = arr.length - 1) {
  if (start < end) {
    let mid = parseInt((start + end) / 2);
    mergeSort(arr, start, mid);
    mergeSort(arr, mid + 1, end);
    linerMerge(arr, start, mid, end);
  }
}
function linerMerge(arr, start, mid, end) {
  let temp = [];
  let i = start,
    j = mid + 1,
    k = 0;
  while (i <= mid && j <= end) {
    if (arr[i] < arr[j]) {
      temp[k++] = arr[i++];
    } else {
      temp[k++] = arr[j++];
    }
  }
  while (i <= mid) {
    temp[k++] = arr[i++];
  }

  while (j <= end) {
    temp[k++] = arr[j++];
  }
  for (let i = start; i <= end; i++) {
    arr[i] = temp[i - start];
  }
}
mergeSort(arr);
console.log(arr);
