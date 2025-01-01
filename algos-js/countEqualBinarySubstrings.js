/*A binary string is a string consisting only  of 0s and 1s. 
A substring is a contiguous  group of characters within a string  
L  
Given a binary String find the number of  substrings that contain an equal  number of 0s and 1s 
and all the 0s and  1s are grouped together. 
Note that  duplicate substrings are also counted in  the answer.
 For example, '001 1' has two  overlapping substrings that meet the 
  criteria: '0011' and '01'.  
*/
function countEqualBinarySubstrings(s) {
    const groups = [];
    let count = 1;

    // Step 1: Count consecutive groups of 0s and 1s
    for (let i = 1; i < s.length; i++) {
        if (s[i] === s[i - 1]) {
            count++;
        } else {
            groups.push(count);
            count = 1;
        }
    }
    groups.push(count);

    // Step 2: Count valid substrings between adjacent groups
    let result = 0;
    for (let i = 1; i < groups.length; i++) {
        result += Math.min(groups[i], groups[i - 1]);
    }

    return result;
}

// Example usage:
const s = "000001";
console.log("Number of substrings:", countEqualBinarySubstrings(s));
