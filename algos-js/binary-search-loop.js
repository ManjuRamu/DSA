
let arr = [1, 2, 4, 7, 10, 15, 16];
let find = 11;
let left =0;
let right = arr.length -1
let found = false;
while (left < right) {
  let mid = parseInt((left+right)/2)
  if (arr[mid] === find || arr[left] === find || arr[right] === find) {
    found = true
    break;
  }
  if (arr[mid] > find) {
    right = mid-1
  }else{
    left = mid+1
  }
}
console.log(found)