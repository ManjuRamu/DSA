const arr = [1,2,4,5,6];
let i=0,expectXor=0,actualXor=0;
while(i <arr.length){
expectXor ^= i+1
actualXor ^=arr[i]
i++;
}
console.log(i)

console.log((expectXor ^ i+1 ) ^ actualXor)
