let arr = [1, 2, 4, 7, 10, 15, 16];
let find = 16;

function binarySearch(arr, left, right, find) {
  if (left > right) return -1;
  let mid = parseInt((left + right) / 2);
  if (arr[mid] == find) return true;
  // if(arr[left] == find) return true;
  // if(arr[right] == find) return true;
  else if (find > arr[mid]) {
    return binarySearch(arr, mid + 1, right, find);
  } else return binarySearch(arr, left, mid - 1, find);
}
console.log(binarySearch(arr, 0, arr.length - 1, find));
