/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var subarraySum = function (nums, k) {
    let output = 0;
    for (let i = 0; i < nums.lenght; i++) {
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