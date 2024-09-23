const arr = [1,2,4,6,89,11,3,5]
const prefixSum = [];
prefixSum[0] = arr[0]
for(let i =1; i<arr.length ; i++){
    prefixSum[i] =  prefixSum[i-1] + arr[i]
}
console.log(prefixSum)