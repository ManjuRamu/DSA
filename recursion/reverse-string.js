let str = "hello world"

function reverseString(src, i=0) {
if(src.charAt(i) == "") return "";
 return  reverseString(src, i+1)+src.charAt(i)
}
// console.log(reverseString(str))


function reverseStringType2(src) {
  if(src  === "") return "";
   return  reverseStringType2(src.substring(1))+src.charAt(0)
  }
  console.log(reverseStringType2(str))