/**
 * push the max to end
 * step:
 *  compare adjacent element and swap
 * TimeComplexity 
 * worst/avg  O(n^2) 
 * best O(n)
 */
function bubbleSort(){
const arr = [2,1,3,5,6];
for(let i=0;i<arr.length-1;i++){
    let didSwap = false   
 for(let j=0;j<arr.length-1-i;j++){
    if(arr[j] > arr[j+1]){
        const temp = arr[j];
        arr[j] = arr[j+1]
        arr[j+1] = temp
        didSwap = true
    }
 }
 if(!didSwap) break;
}
console.log(arr)
}
bubbleSort()