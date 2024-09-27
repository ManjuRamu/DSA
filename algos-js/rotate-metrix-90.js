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

/*
13  9  5 1
14 11 12 2
15 21 22 3
16 12 8  4
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

// clock-wise 90
for(let i = 0; i<arr.length; i++){
  arr[i].reverse()
  // for(let start= 0 , end = arr[i].length-1; start < end; start++, end--){
   
  //   const temp =  arr[i][start]
  //   arr[i][start] = arr[i][end] 
  //   arr[i][end] = temp;
  // }
}


// column reverse of transpose
// anti clock-wise 90
// for(let start = 0, end = arr.length-1; start < end ; start++, end--){
//   const temp = arr[start]
//   arr[start] = arr[end];
//   arr[end] = temp
// }
// arr.reverse()
for (let k = 0; k < arr.length; k++) {
  let str = ""
  for (let l = 0; l < arr[k].length; l++) {
      str+= " "+arr[k][l]
  }
  console.log(str)
  
}