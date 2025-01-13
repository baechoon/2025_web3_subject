let count=0;


function signUp(){ console.log(`signup`)

    let phoneInput=document.querySelector('.wphoneInput')
    let peopleInput=document.querySelector('.wpeopleInput')

    let wphone=phoneInput.value;
    let wpeople=peopleInput.value;

    let info={wphone:wphone,wpeople:wpeople};
   
    
    let option={
        method:'POST',
        headers:{'Content-Type':'application/json'},
        body:JSON.stringify(info)
        
    }
   
    fetch('/signup.do',option)
    .then(response=>response.json())
    .then(data=>{console.log(data);
      if(data==true){
       count++
       alert(`대기:${count}번 입니다`)

      }else{alert(`등록실패`)}
})
    .catch(error=>console.log(error));

    
    phoneInput.value='';
    peopleInput.value='';
    
}
//콘솔에만 출력
 function list(){console.log('list');

     fetch('/list.do')
    .then(response=>response.json())
    .then(data=>console.log(data))

    .catch(error=>console.log(error));
    
    
    

}
// 콘솔에만 출력 돼서 구글링 해봄 
//data 가져와서 html에 출력하기
function view(){console.log('view');
    fetch("http://localhost:8080/list.do")
    .then(response=>response.json())
    .then(data=>
       data.forEach(element => {
        document.querySelector("#container").innerHTML+=`
        
         <tr>
            <td>${element.wphone}</td> <td>${element.wpeople}</td>
         </tr>`;
 
})
    )

    .catch(error=>console.log(error));
    

}
