let a1 = [1,2,3,4,5,6]
let a2 =[3,9,10]
let p1 = 0;
let p2 =0;
let merge = []
let mainPtr = 0
while (p1 < a1.length && p2 < a2.length ) {
  if (a1[p1] < a2[p2]) {
    merge[mainPtr++] = a1[p1++];
  }else{
    merge[mainPtr++] = a2[p2++];
  }
}
if (p1 < a1.length) {
  while (p1 < a1.length) {
 merge[mainPtr++] = a1[p1++] 
  }
}
if (p2 < a2.length) {
  while (p2 < a2.length) {
    merge[mainPtr++] = a2[p2++] 
  }
}

console.log(merge)