package StudentForm;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentForm extends JFrame implements ActionListener {

    // Labels & TextFields
    JLabel lblName, lblAge, lblGender, lblBranch, lblCourse, lblSkills, lblMobile, lblMail, lblAddress;
    JTextField txtName, txtAge, txtGender, txtBranch, txtCourse, txtSkills, txtMobile, txtMail;
    JTextArea txtAddress;
    JButton btnSubmit;

    public StudentForm() {
        // Frame setup
        setTitle("Student Information Form");
        setSize(500, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        // Light purple background
        getContentPane().setBackground(new Color(230, 210, 250));  

        Font labelFont = new Font("Arial", Font.BOLD, 14);

        // Name
        lblName = new JLabel("Name:", SwingConstants.CENTER);
        lblName.setBounds(80, 30, 120, 30);
        lblName.setFont(labelFont);
        txtName = new JTextField();
        txtName.setBounds(230, 30, 180, 30);

        // Age
        lblAge = new JLabel("Age:", SwingConstants.CENTER);
        lblAge.setBounds(80, 70, 120, 30);
        lblAge.setFont(labelFont);
        txtAge = new JTextField();
        txtAge.setBounds(230, 70, 180, 30);

        // Gender
        lblGender = new JLabel("Gender:", SwingConstants.CENTER);
        lblGender.setBounds(80, 110, 120, 30);
        lblGender.setFont(labelFont);
        txtGender = new JTextField();
        txtGender.setBounds(230, 110, 180, 30);

        // Branch
        lblBranch = new JLabel("Branch:", SwingConstants.CENTER);
        lblBranch.setBounds(80, 150, 120, 30);
        lblBranch.setFont(labelFont);
        txtBranch = new JTextField();
        txtBranch.setBounds(230, 150, 180, 30);

        // Course
        lblCourse = new JLabel("Course:", SwingConstants.CENTER);
        lblCourse.setBounds(80, 190, 120, 30);
        lblCourse.setFont(labelFont);
        txtCourse = new JTextField();
        txtCourse.setBounds(230, 190, 180, 30);

        // Skills
        lblSkills = new JLabel("Skills:", SwingConstants.CENTER);
        lblSkills.setBounds(80, 230, 120, 30);
        lblSkills.setFont(labelFont);
        txtSkills = new JTextField();
        txtSkills.setBounds(230, 230, 180, 30);

        // Mobile
        lblMobile = new JLabel("Mobile:", SwingConstants.CENTER);
        lblMobile.setBounds(80, 270, 120, 30);
        lblMobile.setFont(labelFont);
        txtMobile = new JTextField();
        txtMobile.setBounds(230, 270, 180, 30);

        // Mail
        lblMail = new JLabel("Email:", SwingConstants.CENTER);
        lblMail.setBounds(80, 310, 120, 30);
        lblMail.setFont(labelFont);
        txtMail = new JTextField();
        txtMail.setBounds(230, 310, 180, 30);

        // Address (multiline)
        lblAddress = new JLabel("Address:", SwingConstants.CENTER);
        lblAddress.setBounds(80, 350, 120, 30);
        lblAddress.setFont(labelFont);
        txtAddress = new JTextArea();
        txtAddress.setBounds(230, 350, 180, 60);
        txtAddress.setLineWrap(true);
        txtAddress.setWrapStyleWord(true);
        txtAddress.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        // Submit Button
        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(180, 440, 120, 40);
        btnSubmit.setBackground(new Color(120, 70, 170)); // purple
        btnSubmit.setForeground(Color.white);
        btnSubmit.setFont(new Font("Arial", Font.BOLD, 14));
        btnSubmit.addActionListener(this);

        // Add components
        add(lblName); add(txtName);
        add(lblAge); add(txtAge);
        add(lblGender); add(txtGender);
        add(lblBranch); add(txtBranch);
        add(lblCourse); add(txtCourse);
        add(lblSkills); add(txtSkills);
        add(lblMobile); add(txtMobile);
        add(lblMail); add(txtMail);
        add(lblAddress); add(txtAddress);
        add(btnSubmit);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Collect values
        String name = txtName.getText();
        String age = txtAge.getText();
        String gender = txtGender.getText();
        String branch = txtBranch.getText();
        String course = txtCourse.getText();
        String skills = txtSkills.getText();
        String mobile = txtMobile.getText();
        String mail = txtMail.getText();
        String address = txtAddress.getText();

        // Validate
        if (!name.isEmpty() && !age.isEmpty() && !gender.isEmpty() &&
            !branch.isEmpty() && !course.isEmpty() && !skills.isEmpty() &&
            !mobile.isEmpty() && !mail.isEmpty() && !address.isEmpty()) {

            JOptionPane.showMessageDialog(this,
                    "Student Information:\n" +
                    "Name: " + name + "\n" +
                    "Age: " + age + "\n" +
                    "Gender: " + gender + "\n" +
                    "Branch: " + branch + "\n" +
                    "Course: " + course + "\n" +
                    "Skills: " + skills + "\n" +
                    "Mobile: " + mobile + "\n" +
                    "Email: " + mail + "\n" +
                    "Address: " + address,
                    "Details Submitted", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(this,
                    "Please fill all fields!",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new StudentForm();
    }
}
