/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author murta
 */
public class WorkQueue {

    private ArrayList<WorkRequest> workRequestList;

    private ArrayList<WorkRequest> personalRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList<>();
        personalRequestList = new ArrayList<>();
    }

    public ArrayList<WorkRequest> getPersonalRequestList() {
        return personalRequestList;
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }

}
