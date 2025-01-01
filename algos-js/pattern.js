/**
 * 
 *     *
 *    * *
 *  * * * *
 *  | | |*| | | | |*| | |
 *  | |*|*|*| | |*|*|*| |
 *  |*|*|*|*|*|*|*|*|*|*|
 *  
 * n =3
 * end = n+(n-1)
 * space = n-1
 */

const n =6;
let space = n-1;
let astric = 1
let endOfBlock = n+(n-1)
function pattren(times =0, n, space, astric){
    if(times >= n){
        return;
    }
    console.log(`${''.padStart(space, ' ')}${"".padStart(astric, "*")}`)
    pattren(times+1, n, space-1,astric+2)
}
// pattren(0, n, space, astric)

for(i =0; i<(n*2)-1 ; i++){
   let single =`${''.padStart(space, ' ')}${"".padStart(astric, "*")}`
   let block = single;
   for(let j =0 ; j < n-1 ;j++){
     block += "".padStart(space+1, " ")+single
   }
   console.log(block)
//   console.log(`${''.padStart(space, ' ')}${"".padStart(astric, "*")}`)
  if(i < n-1){
    space--;
    astric +=2;
  }   
 else{
    space++;
    astric -=2;
  }
}
