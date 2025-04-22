function sort() {
  const arr = [4, 6, 2, 5, 7, 9,3, 1, 4];
  quickSort(arr, 0, arr.length - 1);
  console.log(arr);
}
function quickSort(arr, low, high) {
  if (low < high) {
    const partition = placePivot(arr, low, high);
    quickSort(arr, low, partition - 1);
    quickSort(arr, partition + 1, high);
  }
}

function placePivot(arr, low, high) {
  const pivot = arr[low];
  let i = low ;
    j = high + 1;
  while (i < j) {
    do {
      i++;
    } while (arr[i] < pivot && i < high);
    do {
      j--;
    } while (arr[j] > pivot && j > low);
    if(i < j){
        [arr[i], arr[j]] = [arr[j], arr[i]];
    }
  }
   [arr[j],arr[low]] = [arr[low], arr[j]]
  return j;
}
sort();
