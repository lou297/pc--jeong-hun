 import java.awt.BorderLayout;                                                                                                    
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
class MyFrame implements ActionListener
{
    CardLayout card = new CardLayout();
    JFrame frm = new JFrame();
    JPanel panelCard = new JPanel();
    JPanel btnPanel = new JPanel();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JTextField text1 = new JTextField("First Card Page");
    JTextField text2 = new JTextField("Second Card Page");
    JTextField text3 = new JTextField("Third Card Page");
    JTextField text4 = new JTextField("Fourth Card Page");
    JButton btn1 = new JButton("<<");
    JButton btn2 = new JButton("<");
    JButton btn3 = new JButton(">");
    JButton btn4 = new JButton(">>");
    JButton btn5 = new JButton("Exit");
    
    public MyFrame()
    {
        frm.setLocation(120, 120);
        frm.setTitle("포커스 테스트");
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);        
        //컴포넌트에 ActionEventListener 장착
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        //버튼패널에 버튼 장착
        btnPanel.add(btn1);
        btnPanel.add(btn2);
        btnPanel.add(btn3);
        btnPanel.add(btn4);
        btnPanel.add(btn5);
        //각 패널마다 텍스트필드 장착
        panel1.add(text1);
        panel2.add(text2);
        panel3.add(text3);
        panel4.add(text4);
        //배치관리자를 CardLayout으로 설정 후 추가(추가순으로 카드순서가 된다)
        panelCard.setLayout(card);
        panelCard.add(panel1);
        panelCard.add(panel2);
        panelCard.add(panel3);
        panelCard.add(panel4);
        //프레임에 장착
        frm.add(btnPanel, BorderLayout.NORTH);
        frm.add(panelCard, BorderLayout.CENTER);
        frm.pack();
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getActionCommand().equals("<<"))
        {
            card.first(panelCard); //자신을 소유한 부모 컨테이너에게 변화를 알려야 함
        }
        else if(e.getActionCommand().equals("<"))
        {
            card.previous(panelCard);
        }
        else if(e.getActionCommand().equals(">"))
        {
            card.next(panelCard);
        }
        else if(e.getActionCommand().equals(">>"))
        {
            card.last(panelCard);
        }
        else if(e.getActionCommand().equals("Exit"))
        {
            System.exit(0);
        }
    }
}
 
public class test
{
    public static void main(String[] args) 
    {
        MyFrame my = new MyFrame();
    }
}