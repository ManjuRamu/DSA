const a = [1, 1, 2, 3, 4, 5, 6, 12, 14, 15];
const b = [1, 1, 1, 2, 4, 4, 4, 4, 6, 6, 7, 8];
let i = 0,
  j = 0,
  res = [];
while (i < a.length && j < b.length) {
  if(a[i] < b[j]){
    i++
  }
  else if(b[j] < a[i]){
    j++
  }else{
    res.push(a[i])
    i++,j++;
  }
}
console.log(res);
