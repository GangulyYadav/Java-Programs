
// CWH practice set 11 question 4
// By Ganguly Yadav
// 3rd August 2021

abstract class Telephone {
    abstract void ring();

    abstract void lift();

    abstract void disconnect();
}

class SmartPhone {
    void ring() {
        System.out.println("Ringing..  SmartPhone");
    }

    void lift() {
        System.out.println("Lifting.. SmartPhone");
    }

    void disconnect() {
        System.out.println("Disconnecting.. SmartPhone");
    }
}

class Mobile {
    void ring() {
        System.out.println("Ringing..  TelePhone");
    }

    void lift() {
        System.out.println("Lifting.. TelePhone");
    }

    void disconnect() {
        System.out.println("Disconnecting.. TelePhone");
    }

    public static void main(String[] args) {
        Mobile m = new Mobile();
        SmartPhone s = new SmartPhone();
        m.ring();
        m.lift();
        m.disconnect();
        s.ring();
        s.lift();
        s.disconnect();
    }

}
