package Level2pro;

import java.io.Serializable;

public class Hero implements Serializable{
        private String name;
        private String lines;
        public Hero(String name,String lines){
            this.name=name;
            this.lines=lines;
        }
        public String toString(){
            return "英雄名称:"+this.name+"："+this.lines;
        }
    }

