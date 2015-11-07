package com.sofe;

public class Calculator {

    private boolean _canCalculate;

    private double _state;
    private int _operation;
    private double _display;

    public Calculator() {
        _state = 0;
        _operation = 0;
        _canCalculate = false;
    }

    public void pressNumber(double n) {
        _state = n;
    }

    public void pressSum() {
        _operation = 1;
        calculate();
        _canCalculate = true;
    }

    public void pressMinus() {
        _operation = 2;
        calculate();
        _canCalculate = true;
    }

    public void pressMultiply() {
        _operation = 3;
        calculate();
        _canCalculate = true;
    }

    public void pressDivide() {
        _operation = 4;
        calculate();
        _canCalculate = true;
    }

    public void pressEquals() {
        calculate();
    }

    public double getResult() {
        return _display;
    }

    private void calculate() {
        if (_canCalculate) {
            switch (_operation) {
                case 1:
                    _display += _state;
                    break;
                case 2:
                    _display -= _state;
                    break;
                case 3:
                    _display *= _state;
                    break;
                case 4:
                    _display /= _state;
                    break;
            }
            _canCalculate = false;
        } else {
            _display = _state;
        }
    }
}
