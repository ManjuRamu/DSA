function printName(name,i, times){
    if(i === times) return i
     console.log(name)
 printName(name, i+1, times)

}

function printRange(i, range){
    if(i > range) return;
    console.log(i);
    printRange(i+1, range)
}

function printRangeBackTrack(i, range){ 
    if(i < 1) return   
    printRangeBackTrack(i-1, range)
    console.log(i)
}
function printDecresingBt(i, range){
    if(i > range) return;
    
         printDecresingBt(i+1,range)
          console.log(i)
    }
    printDecresingBt(0 ,5)