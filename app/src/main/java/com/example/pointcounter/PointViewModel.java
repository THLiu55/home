package com.example.pointcounter;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PointViewModel extends ViewModel {
    private MutableLiveData<Integer> number_A, number_B;
    private int a_back, b_back;

    public MutableLiveData<Integer> getNumber_A() {
        if (number_A == null) {
            number_A = new MutableLiveData<>();
            number_A.setValue(0);
            a_back = 0;
        }
        return number_A;
    }

    public MutableLiveData<Integer> getNumber_B() {
        if (number_B == null) {
            number_B = new MutableLiveData<>();
            number_B.setValue(0);
            b_back = 0;
        }
        return number_B;
    }

    public void addTeamA(int add) {
        a_back = number_A.getValue();
        b_back = number_B.getValue();
        number_A.setValue(this.getNumber_A().getValue() + add);
    }

    public void addTeamB(int add) {
        a_back = number_A.getValue();
        b_back = number_B.getValue();
        number_B.setValue(this.getNumber_B().getValue() + add);
    }

    public void reset() {
        a_back = number_A.getValue();
        b_back = number_B.getValue();
        number_A.setValue(0);
        number_B.setValue(0);
    }

    public void undo() {
        number_B.setValue(b_back);
        number_A.setValue(a_back);
    }
}
