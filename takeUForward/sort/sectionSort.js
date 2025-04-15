/**
 * take the min value place it first 
 * swap the value and then do the same steps
 * Time Complexity
 * O(n^2)
 */
function sectionSort(){
 const arr = [4, 5, 3, 4, 2, 3];
 for(let i=0;i<arr.length-1;i++){
  const {min,index} = findMin(arr,i)
   arr[index] = arr[i]
   arr[i] = min;
 }
 function findMin(arr, start){
    let min = Infinity,index=-1
    for(let i =start;i<arr.length;i++){
      if(arr[i] < min){
        min = arr[i]
        index = i
      }
    }
    return {min,index}
 }
console.log(arr)
}
sectionSort()