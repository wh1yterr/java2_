package com.makotogroup.intro;
public class Command {
    private String fam;
    private String rota;
    private String zvanie;
    private String datarozh;
    private String datapost;
    private String chast;
    public Command(String fam, String rota, String zvanie, String datarozh, String datapost, String chast) {
        this.fam = fam;
        this.rota = rota;
        this.zvanie = zvanie;
        this.datarozh = datarozh;
        this.datapost = datapost;
        this.chast = chast;
    }
    public String getfam() {
        return fam;
    }
    public void setid(String fam) {
        this.fam = fam;
    }
    public String getrota() {
        return rota;
    }
    public void setrota(String rota) {
        this.rota = rota;
    }
    public String getzvanie() {
        return zvanie;
    }
    public void setzvanie(String zvanie) {
        this.zvanie = zvanie;
    }
    public String getdatarozh() {
        return datarozh;
    }
    public void setdatarozh(String datarozh) {
        this.datarozh = datarozh;
    }
    public String getdatapost() {
        return datapost;
    }
    public void setdatapost(String datapost) {
        this.datapost = datapost;
    }
    public String getchast() {
        return chast;
    }
    public void setchast(String chast) {
        this.chast = chast;
    }

    public String toString()
    {
        return " Familiya: " + fam + ";\n Rota: "+rota+";\n Zvanie: "+zvanie+";\n Data rozhdeniya: " + datarozh + ";\n Data postupleniya na sluzhbu: "+datapost+";\n Chast: "+chast+".";
    }
}

