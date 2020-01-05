package javasmmr.zoowsome.views;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

import javasmmr.zoowsome.services.factories.Constants.FRAMES;
import javasmmr.zoowsome.views.utilities.FrameStack;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public abstract class ZooFrame extends JFrame implements ZooFrame_I {
	protected JPanel contentPanel;
	private JLabel cl;
	String[] times = { "Europe/Bucharest", "Europe/Budapest", "Japan", "US/Hawaii", "Europe/Moscow" };
	JComboBox timeZoneList = new JComboBox(times);

	public ZooFrame(String title) {
		FrameStack.getInstance().push(this);
		setTitle(title);
		setSize(FRAMES.WIDTH, FRAMES.HEIGHT);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setBackground(Color.BLACK);
		add(contentPanel, BorderLayout.CENTER);
	}
	public void Thread1(JLabel clock) {
		
        Thread t1 = new Thread() {
            public void run() {
                try {
                    for(;;) {
                        Calendar cal = Calendar.getInstance();
                        SimpleDateFormat format= new SimpleDateFormat("HH:mm:ss");
                        String timeString;
                        timeString=(String) timeZoneList.getSelectedItem();
                        format.setTimeZone(TimeZone.getTimeZone(timeString));
                        //int hour = cal.get(Calendar.HOUR_OF_DAY);
                        //int minute = cal.get(Calendar.MINUTE);
                        //int second = cal.get(Calendar.SECOND);
                        
                        clock.setText(format.format(cal.getTime()));
                        sleep(1000);
                    }
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } 
            }
        };t1.start();
    }
	public void setBackButtonActionListener(ActionListener a) {
		JPanel buttonPanel = new JPanel();
		JPanel clockPanel = new JPanel();
		JPanel topPanel= new JPanel();
		topPanel.setLayout(new GridLayout(0,2));
		buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		clockPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		JButton backButton = new JButton("Back");
		JLabel clock = new JLabel("clock");
		clock.setFont(new Font("clock", Font.BOLD, 20));
		Thread1(clock);
		buttonPanel.add(backButton);
		clockPanel.add(timeZoneList);
		clockPanel.add(clock);
		topPanel.add(buttonPanel);
		topPanel.add(clockPanel);
		this.add(topPanel, BorderLayout.NORTH);
		backButton.addActionListener(a);
	}

	public void goBack() {
	}
}
