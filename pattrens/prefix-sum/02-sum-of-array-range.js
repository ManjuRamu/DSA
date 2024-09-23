const ranges = {
    0:[2,3], //7
    1:[5,8], //30
    2:[3,7], //30
    3:[0,5]
}
const arr = [1,2,3,4,5,6,7,8,9,10]
/*
arr = [1,2,3,5,6]
pre-fix-sum = [1,3,6,11,17]
ranges:
  1-3 -> 1-min,3-max  
    prefixSum[max] - prefixSum[min-1] 
    11- 1 = 10
*/

function sumOfEelementsInRanges(arr,ranges){
    const preSumArr = []
    preSumArr[0] = arr[0]
    for(let i=1;i<arr.length;i++){
     preSumArr[i] = preSumArr[i-1] + arr[i]
    }
    Object.keys(ranges).forEach((key) =>{
        const [min, max] = ranges[key];
        ranges[key].sum =  
            preSumArr[max] ?? 0 - preSumArr[min-1] ?? 0
        
    })
}
sumOfEelementsInRanges(arr, ranges)
console.log(ranges)