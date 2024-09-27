let str = "abcaicbc"
function isPalindrome(str){
  if (str.length == 0 || str.length == 1) {
    return true;
  }
  else if(str.charAt(0) != str.charAt(str.length -1)) {
    return false
  }
  return isPalindrome(str.substring(1, str.length-1))
}
console.log(isPalindrome(str))