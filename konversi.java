/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123200143_konvertersuhu;

/**
 *
 * @author DARUL ZUMANI
 */
public class konversi {
    //reanure R = (4 * C)/5
    //faren F = (9 * C)/5 + 32
   //kelvin K = C + 273.15
    
    private float celci;
    
    public konversi (float celci){
    this.celci = celci;
    }
    public float nilai(){
        return this.celci;
    }
    public void aturCelcius(float celci) {
        this.celci = celci;
    }
    public float reamure(){
        float R = (4 * celci)/5;
        return R;
    }
    
    public float faren(){
        float F = (9 * celci)/5 + 32;
        return F;
    }
    
    public float kelvin(){
        float K = (float) (celci + 273.15);
        return K;
    }
    

}
