package inner;

class Button {
    OnClickListener clickListener;


    //위젯에 대한 event handler를 anonymous로 만듬.
    public Button(OnClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click() {

    }

}

public class AnonymousInnerClassTest {
    public static void main(String[] args) {
        Button button = new Button(new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("clicked");
            }
        });
        button.click();
    }
}

interface OnClickListener {
    void onClick();
}
