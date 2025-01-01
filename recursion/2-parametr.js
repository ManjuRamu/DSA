function sumOfArrayParameter(arr, i, sum){
    if(i > arr.length -1) {
         return sum}
         sum += arr[i]
return sumOfArrayParameter(arr, i+1, sum)

}
// console.log(sumOfArrayParameter([1,2,3],0,0))/
function sumOfArrayFun(arr, i){
    if(i === arr.length-1) return arr[i];
  return arr[i]+ sumOfArrayFun(arr, i+1)
}
function fib(first, second,n,  res){
    if(n === res.length) return;
    res.push(first+second)
    fib(second, first+second, n, res) 
    return res;
}

// console.log(fib(0,1,5, [0,1]))/
function fibInRange(start,end, first=0 ,second=1, res=[]){
    if(end <=1) {
       return [0,1,1]
    }
    if(first+second > end) return;
    const fib = first+second;
    if(fib >= start && fib <= end){
        res.push(fib)
    }
    fibInRange(start, end, second, first+second, res)
    return res;
}
// console.log(fibInRange(5,10))
function factorialOfN(n){
    if( n === 2) return n;
   return n * factorialOfN(n-1)
}

function reverseAnArray(arr,i=0, res=[]){
    if(i > arr.length-1) return res;
      reverseAnArray(arr, i+1, res)
      res.push(arr[i])
      return res;
}


// console.log(reverseAnArray([1,2,3]))

function reverseAnArray0n(arr,start=0){
    if(start > arr.length-1) return ;
     const ele = arr[start]
     reverseAnArray0n(arr, start+1)
     arr[arr.length - start-1] = ele 
     return arr;
}
const arr =[1,2,3,4]
// console.log(reverseAnArray0n(arr))

function reverseAnArrayTwoPinterMock(start=0, end, arr){
if(start >= end) return;
[arr[start], arr[end]] = [arr[end],arr[start]] 
reverseAnArrayTwoPinterMock(start+1, end-1, arr)
return arr;
}
// console.log(reverseAnArrayTwoPinterMock(0,3,[1,2,3,4]))


function palindrome(str, start, end){
    if(start >= end || str[start] !== str[end]) return str[start] === str[end]
    return palindrome(str, start+1, end-1)
}
let str = "abbacddcazba"
console.log(palindrome(str,0, str.length-1))
