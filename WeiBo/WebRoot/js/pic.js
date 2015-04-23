     window.onload=function(){       
            var container=document.getElementById("picContainer");
            var prev=document.getElementById('picPrev');//获取向后指向的id
            var buttons=document.getElementById('picButtons').getElementsByTagName('span');//获取图片下面的点
            var next=document.getElementById('picNext');//获取向前指向的id
            var list=document.getElementById('picList');//图片列表
            var index=1;//选择第index个点亮
            var moving=false;   //moving的作用是判断是否移动,这样可以使得在多次点击下一张,或者图片按钮时不会出现卡顿现象
            var timer; // 图片自动播放的定时器

            function showButton(){  //让点亮起来的函数. 因为有个on的class,on的css属性可以改变颜色;
                for (var i = 0; i < buttons.length; i++) {//遍历循环让不是选中的图片下面对应的button黑 , 
                    if(buttons[i].className=="on"){
                        buttons[i].className="";
                        break;       
                    }
                }
                buttons[index-1].className="on";//让选中的图片的相应的button亮
                  
            }

            function arrowMove(direction){//左移就是减,右移就是加
                moving=true;
                var newLeft=parseInt(list.style.left)+direction;
                var time=500;//位移总时间    
                        //    time和interval的值如果相同就是图片一张一张的显示, 如果不相同才会有慢慢滑动的效果
                var interval=300;//位移间隔时间
                var speed=direction/(time/interval);//每次位移量

                function go(){
                    if((speed<0 && parseInt(list.style.left)>newLeft) ||(speed>0 && parseInt(list.style.left)<newLeft)){
                        list.style.left=parseInt(list.style.left)+speed+'px';
                        setTimeout(go,interval);
                     /*   debugger;*/
                    }
                    else{
                        moving=false;
                         list.style.left=newLeft+'px';
                        if(newLeft>-440){
                                list.style.left=-2200+'px'//如果超过了-440, 就移动到第5个
                                
                            }
                        if(newLeft<-2200){
                            list.style.left=-440+'px';
                        }
                    }
                }
               go();
            }

             for (var i = 0; i < buttons.length; i++) {// 点击图片的按钮,图片跳转,并且按钮变色
                 buttons[i].onclick=function(){
                    if(this.className=="on"){//优化代码: 当点击相同图片按钮的时候不需要再往下重复执行代码;
                        return;
                    }
                    var myIndex=parseInt(this.getAttribute('index'));//获取相对的按钮位置. 每个图片大小为600px宽,这样每次要移动到的位置减去现在图片的位置就刚好
                    // var myIndex=i;// 不能直接等于i的,这样只要按钮点击一下就会一直加到i=5;不会变化
                    var offset=-440*(myIndex-index);//移动到哪个图片.计算出位置
                    if (!moving) {
                        arrowMove(offset);//移动
                    }
                        
                    index=myIndex;// 把当前的index改变,这样下次移动的时候就根据现在的index值改变图片了
                    showButton();//显示按钮
                    /*debugger;  调试的时候可以用  断点*/
                 }      
             };

            next.onclick=function() {
                if(index>=5){ //防止一直点prev  a标签时,button不亮, 因为图片到第五张时可以跳回第一张,所以按钮要相应变换
                    index=1;
                }else{
                    index+=1;     
                }
               
                showButton();
                if(!moving){
                    arrowMove(-440);    
                }
                
            }
            prev.onclick=function() {
                if(index<=1){// 图片点到最左边时, index赋值为5, 并且最后一站个图片亮起来
                    index=5;
                }else{
                    index-=1;    
                }
                
                showButton();
                if(!moving){
                    arrowMove(440);    
                }
                
            }
            function play(){ //自动播放图片   其实就是让next.onclick()事件触发
                timer=setInterval(function(){ //设定定时器时间
                    next.onclick();//触发onclick事件
                },4000);//4000 数字表示图片自动移动的快慢
            }
            function stop(){// 停止自动播放图片.
                clearInterval(timer);//清除定时器的事件
            }

            container.onmouseover=stop;//鼠标移上去的时候停止
            container.onmouseout=play;//鼠标移开的时候自动播放  在container容器里面;
            play();//自动播放


        }