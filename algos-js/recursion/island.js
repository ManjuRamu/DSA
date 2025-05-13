let land = [
  [1, 1, 0, 1],
  [1, 1, 1, 1],
  [0, 1, 0, 1],
  [1, 0, 0, 1],
];
const m = 4,n=4;

function largestIsland(arr, m, n){
  const area = []
  for(let i = 0; i<arr.length; i++){
    for(let j=0; j < arr[i].length; j++ )
    area.push(findArea(arr, i, j));
  }
  console.log(Math.max(...area))
}
const visited  = new Map();
function findArea(arr, i, j){
  if( i <0 || j <0 || i >= arr.length || j >= arr[i].length || arr[i][j] === 0 || visited.has(`${i},${j}`))
    return 0;

  visited.set(`${i},${j}`)
 return 1+ findArea(arr, i, j+1)
  +findArea(arr, i , j-1)
  +findArea(arr, i+1, j)
  +findArea(arr, i-1, j)
}
largestIsland(land, m, n)