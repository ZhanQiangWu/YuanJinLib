package net.smileface.yuanjin.core;

/**
 *  Created by WuZhanQiang on 2016/9/23.
 */
public class SfaceCoreConfig {



    public SfaceCoreConfig(Builder builder){


    }




    public static class Builder{

        public Builder MapConfig(){

            return this;
        }

        public SfaceCoreConfig build(){

            return new SfaceCoreConfig(this);

        }
    }


}
