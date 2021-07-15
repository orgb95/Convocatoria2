/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.fcys.programacion.convocatoria23.Pojo;

/**
 *
 * @author Sistemas-05
 */
public class FNE {
    private float inversion;
    private float ingresos;
    private float egresos;
    private float depreciacion1;
    private float valorSalvamento;
    private float UAI;
    private float IR;
    private float UDI;
    private float depreciacion2;
    private float FNE;

    public FNE() {
    }

    public FNE(float inversion, float ingresos, float egresos, float depreciacion1, float valorSalvamento, float UAI, float IR, float UDI, float depreciacion2, float FNE) {
        this.inversion = inversion;
        this.ingresos = ingresos;
        this.egresos = egresos;
        this.depreciacion1 = depreciacion1;
        this.valorSalvamento = valorSalvamento;
        this.UAI = UAI;
        this.IR = IR;
        this.UDI = UDI;
        this.depreciacion2 = depreciacion2;
        this.FNE = FNE;
    }

    public float getInversion() {
        return inversion;
    }

    public void setInversion(float inversion) {
        this.inversion = inversion;
    }

    public float getIngresos() {
        return ingresos;
    }

    public void setIngresos(float ingresos) {
        this.ingresos = ingresos;
    }

    public float getEgresos() {
        return egresos;
    }

    public void setEgresos(float egresos) {
        this.egresos = egresos;
    }

    public float getDepreciacion1() {
        return depreciacion1;
    }

    public void setDepreciacion1(float depreciacion1) {
        this.depreciacion1 = depreciacion1;
    }

    public float getValorSalvamento() {
        return valorSalvamento;
    }

    public void setValorSalvamento(float valorSalvamento) {
        this.valorSalvamento = valorSalvamento;
    }

    public float getUAI() {
        return UAI;
    }

    public void setUAI(float UAI) {
        this.UAI = UAI;
    }

    public float getIR() {
        return IR;
    }

    public void setIR(float IR) {
        this.IR = IR;
    }

    public float getUDI() {
        return UDI;
    }

    public void setUDI(float UDI) {
        this.UDI = UDI;
    }

    public float getDepreciacion2() {
        return depreciacion2;
    }

    public void setDepreciacion2(float depreciacion2) {
        this.depreciacion2 = depreciacion2;
    }

    public float getFNE() {
        return FNE;
    }

    public void setFNE(float FNE) {
        this.FNE = FNE;
    }

    public Object[] asArray() {
        Object[] obj = new Object[10];
        obj[0] = inversion;
        obj[1] = ingresos;
        obj[2] = egresos;
        obj[3] = depreciacion1;
        obj[4] = valorSalvamento;
        obj[5] = UAI;
        obj[6] = IR;
        obj[7] = UDI;
        obj[8] = depreciacion2;
        obj[9] = FNE;
        
        return obj;
    }
   
    
    
}
