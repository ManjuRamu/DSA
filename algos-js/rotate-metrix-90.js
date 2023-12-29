const arr = [
  [1, 2, 3, 4],
  [5, 6, 7, 8],
  [9, 10, 11, 12],
  [13, 14, 15, 16],
];

/*
00 01 02 03
10 11 12 13
20 21 22 23
30 31 32 33
*/

// transpose
for (let i = 0; i < arr.length; i++) {
  for (let j = i; j < arr[i].length; j++) {
    if(i === j) continue;
    const temp = arr[i][j];
    arr[i][j] = arr[j][i];
    arr[j][i] = temp;
  }
}
// column reverse of transpose
for(let start = 0, end = arr.length-1; start < end ; start++, end--){
  const temp = arr[start]
  arr[start] = arr[end];
  arr[end] = temp
}
for (let k = 0; k < arr.length; k++) {
  let str = ""
  for (let l = 0; l < arr[k].length; l++) {
      str+= " "+arr[k][l]
  }
  console.log(str)
  
}