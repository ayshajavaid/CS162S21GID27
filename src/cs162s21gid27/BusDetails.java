package cs162s21gid27;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aysha
 */
public class BusDetails {
    protected String ArrivalCity;
    protected String DepartureCity;
    //////////
    public void setArrCity(String arr)
    {
        this.ArrivalCity = arr;
    }
    public void setDepCity(String dep)
    {
        this.DepartureCity = dep;
    }
    /////////
    public String getArrCity()
    {
        return this.ArrivalCity;
    }
    public String getDepCity()
    {
        return this.DepartureCity;
    }
}
