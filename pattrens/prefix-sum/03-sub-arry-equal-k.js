/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */


//brute-force
var subarraySum = function (nums, k) {
    let output = 0;
    for (let i = 0; i < nums.length ; i++) {
        let sum = nums[i];
        console.log({ sum, k })
        if (sum === k) output++;
        for (let j = i + 1; j < nums.length; j++) {
            sum += nums[j];
            console.log({ sum, k })
            if (sum === k) output++;
        }

    }
    return output;
};
console.log(subarraySum([1,1,1],2))
/*
0,1,2,3,4

0,1
0,1,2
0,1,2,3
0,1,2,3,4

1,2
1,2,3
1,2,3,4

2,3
2,3,4

3,4

*/

function subarraySumPreSum(arr, k){
    const prefixSum =[],count=0;
    prefixSum[i] = arr[i];
    for(let i= 1; i<arr.length; i++){
        prefixSum[i+1] = prefixSum[i]+arr[i];
    }
}
