let arr = [1,2,3,5,6,7,8]
function print(arr, i){
  if(i >= arr.length) return;
  console.log(arr[i]);
  print(arr, i+1)
}
print(arr, 0)