import javax.swing.JOptionPane;

/**
 * TampilanForm - GUI untuk Scientific Calculator
 * Menggunakan class Calculator untuk business logic
 * 
 * @author
 */
public class TampilanForm extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TampilanForm.class.getName());
    
    // Menggunakan class Calculator untuk logika
    private Calculator calculator;

    /**
     * Creates new form TampilanForm
     */
    public TampilanForm() {
        calculator = new Calculator();
        initComponents();
        setupButtonListeners();
    }

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        tanButton = new javax.swing.JButton();
        cosButton = new javax.swing.JButton();
        sinButton = new javax.swing.JButton();
        expButton = new javax.swing.JButton();
        rootButton = new javax.swing.JButton();
        tanhButton = new javax.swing.JButton();
        coshButton = new javax.swing.JButton();
        sinhButton = new javax.swing.JButton();
        logButton = new javax.swing.JButton();
        reciprocalButton = new javax.swing.JButton();
        delButton = new javax.swing.JButton();
        percentButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        equalButton = new javax.swing.JButton();
        dotButton = new javax.swing.JButton();
        zeroButton = new javax.swing.JButton();
        oneButton = new javax.swing.JButton();
        twoButton = new javax.swing.JButton();
        threeButton = new javax.swing.JButton();
        fourButton = new javax.swing.JButton();
        fiveButton = new javax.swing.JButton();
        sixButton = new javax.swing.JButton();
        sevenButton = new javax.swing.JButton();
        eightButton = new javax.swing.JButton();
        nineButton = new javax.swing.JButton();
        plusButton = new javax.swing.JButton();
        minusButton = new javax.swing.JButton();
        multiplyButton = new javax.swing.JButton();
        divideButton = new javax.swing.JButton();
        powerYButton = new javax.swing.JButton();
        power2Button = new javax.swing.JButton();
        power3Button = new javax.swing.JButton();
        factorialButton = new javax.swing.JButton();
        plusMinusButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(44, 44, 80));
        jPanel1.setPreferredSize(new java.awt.Dimension(390, 640));

        jPanel2.setBackground(new java.awt.Color(44, 44, 80));

        jLabel2.setFont(new java.awt.Font("Eurostile-Black", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(218, 216, 227));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SCIENTIFIC CALCULATOR");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(215, 226, 228));
        jTextField1.setFont(new java.awt.Font("DS-Digital", 3, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(30, 30, 32));
        jTextField1.setText("0");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        tanButton.setBackground(new java.awt.Color(58, 63, 93));
        tanButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tanButton.setForeground(new java.awt.Color(218, 216, 227));
        tanButton.setText("tan");

        cosButton.setBackground(new java.awt.Color(58, 63, 93));
        cosButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cosButton.setForeground(new java.awt.Color(218, 216, 227));
        cosButton.setText("cos");
        cosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosButtonActionPerformed(evt);
            }
        });

        sinButton.setBackground(new java.awt.Color(58, 63, 93));
        sinButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        sinButton.setForeground(new java.awt.Color(218, 216, 227));
        sinButton.setText("sin");

        expButton.setBackground(new java.awt.Color(58, 63, 93));
        expButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        expButton.setForeground(new java.awt.Color(218, 216, 227));
        expButton.setText("e^x");
        expButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expButtonActionPerformed(evt);
            }
        });

        rootButton.setBackground(new java.awt.Color(58, 63, 93));
        rootButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rootButton.setForeground(new java.awt.Color(218, 216, 227));
        rootButton.setText("√ ");
        rootButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rootButtonActionPerformed(evt);
            }
        });

        tanhButton.setBackground(new java.awt.Color(58, 63, 93));
        tanhButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tanhButton.setForeground(new java.awt.Color(218, 216, 227));
        tanhButton.setText("tanh");

        coshButton.setBackground(new java.awt.Color(58, 63, 93));
        coshButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        coshButton.setForeground(new java.awt.Color(218, 216, 227));
        coshButton.setText("cosh");

        sinhButton.setBackground(new java.awt.Color(58, 63, 93));
        sinhButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        sinhButton.setForeground(new java.awt.Color(218, 216, 227));
        sinhButton.setText("sinh");

        logButton.setBackground(new java.awt.Color(58, 63, 93));
        logButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        logButton.setForeground(new java.awt.Color(218, 216, 227));
        logButton.setText("log");

        reciprocalButton.setBackground(new java.awt.Color(58, 63, 93));
        reciprocalButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        reciprocalButton.setForeground(new java.awt.Color(218, 216, 227));
        reciprocalButton.setText("1/x");

        delButton.setBackground(new java.awt.Color(164, 167, 176));
        delButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        delButton.setText("DEL");
        delButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delButtonActionPerformed(evt);
            }
        });

        percentButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        percentButton.setText("%");

        clearButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        clearButton.setText("C");

        equalButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        equalButton.setText("=");

        dotButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        dotButton.setText(".");

        zeroButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        zeroButton.setText("0");

        oneButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        oneButton.setText("1");

        twoButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        twoButton.setText("2");
        twoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoButtonActionPerformed(evt);
            }
        });

        threeButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        threeButton.setText("3");

        fourButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        fourButton.setText("4");
        fourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourButtonActionPerformed(evt);
            }
        });

        fiveButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        fiveButton.setText("5");
        fiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveButtonActionPerformed(evt);
            }
        });

        sixButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sixButton.setText("6");

        sevenButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sevenButton.setText("7");

        eightButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        eightButton.setText("8");

        nineButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        nineButton.setText("9");

        plusButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        plusButton.setText("+");
        plusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusButtonActionPerformed(evt);
            }
        });

        minusButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        minusButton.setText("-");

        multiplyButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        multiplyButton.setText("*");

        divideButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        divideButton.setText("/");

        powerYButton.setBackground(new java.awt.Color(58, 63, 93));
        powerYButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        powerYButton.setForeground(new java.awt.Color(218, 216, 227));
        powerYButton.setText("x^y");

        power2Button.setBackground(new java.awt.Color(58, 63, 93));
        power2Button.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        power2Button.setForeground(new java.awt.Color(218, 216, 227));
        power2Button.setText("x^2");

        power3Button.setBackground(new java.awt.Color(58, 63, 93));
        power3Button.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        power3Button.setForeground(new java.awt.Color(218, 216, 227));
        power3Button.setText("x^3");
        power3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                power3ButtonActionPerformed(evt);
            }
        });

        factorialButton.setBackground(new java.awt.Color(58, 63, 93));
        factorialButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        factorialButton.setForeground(new java.awt.Color(218, 216, 227));
        factorialButton.setText("n!");
        factorialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factorialButtonActionPerformed(evt);
            }
        });

        plusMinusButton.setBackground(new java.awt.Color(58, 63, 93));
        plusMinusButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        plusMinusButton.setForeground(new java.awt.Color(218, 216, 227));
        plusMinusButton.setText("+/-");

        jLabel1.setBackground(new java.awt.Color(218, 216, 227));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(218, 216, 227));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("© Jovianie Felisia Suryadi, Fardan Fadhilah Andicha Putra, Newten Putra Santoso");

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(30, 30, 32));
        jTextField2.setFont(new java.awt.Font("DS-Digital", 3, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(215, 226, 228));
        jTextField2.setText("0");
        jTextField2.setFocusable(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(plusMinusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(zeroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(equalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(factorialButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(oneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(twoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(threeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(divideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(power2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sixButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(multiplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(power3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(sevenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(eightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(minusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(powerYButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(percentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(delButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(plusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(reciprocalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(logButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sinhButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(coshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tanhButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(rootButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(expButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(sinButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jTextField1)
                                        .addComponent(jTextField2)))))
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sinButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(expButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rootButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tanhButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sinhButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reciprocalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(plusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(delButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(percentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(powerYButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(minusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(eightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sevenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(power3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(multiplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sixButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(power2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(divideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(threeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(twoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(oneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(factorialButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(equalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(zeroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(plusMinusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 395, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setupButtonListeners() {
        zeroButton.addActionListener(e -> appendNumber("0"));
        oneButton.addActionListener(e -> appendNumber("1"));
        twoButton.addActionListener(e -> appendNumber("2"));
        threeButton.addActionListener(e -> appendNumber("3"));
        fourButton.addActionListener(e -> appendNumber("4"));
        fiveButton.addActionListener(e -> appendNumber("5"));
        sixButton.addActionListener(e -> appendNumber("6"));
        sevenButton.addActionListener(e -> appendNumber("7"));
        eightButton.addActionListener(e -> appendNumber("8"));
        nineButton.addActionListener(e -> appendNumber("9"));

        dotButton.addActionListener(e -> {
            String current = jTextField1.getText();
            if (!current.contains(".")) {
                jTextField1.setText(current + ".");
                calculator.setHistory(calculator.getHistory() + ".");
                jTextField2.setText(calculator.getHistory());
            }
        });
        
        plusButton.addActionListener(e -> setOperator("+"));
        minusButton.addActionListener(e -> setOperator("-"));
        multiplyButton.addActionListener(e -> setOperator("*"));
        divideButton.addActionListener(e -> setOperator("/"));
        
        equalButton.addActionListener(e -> calculate());
        clearButton.addActionListener(e -> clear());
        delButton.addActionListener(e -> deleteLastChar());
        plusMinusButton.addActionListener(e -> toggleSign());
        percentButton.addActionListener(e -> calculatePercent());

        sinButton.addActionListener(e -> calculateTrig("sin"));
        cosButton.addActionListener(e -> calculateTrig("cos"));
        tanButton.addActionListener(e -> calculateTrig("tan"));
        sinhButton.addActionListener(e -> calculateTrig("sinh"));
        coshButton.addActionListener(e -> calculateTrig("cosh"));
        tanhButton.addActionListener(e -> calculateTrig("tanh"));

        power2Button.addActionListener(e -> calculatePower(2));
        power3Button.addActionListener(e -> calculatePower(3));
        powerYButton.addActionListener(e -> setOperator("^"));
        
        rootButton.addActionListener(e -> calculateRoot());
        logButton.addActionListener(e -> calculateLog());
        expButton.addActionListener(e -> calculateExp());
        factorialButton.addActionListener(e -> calculateFactorial());
        reciprocalButton.addActionListener(e -> calculateReciprocal());
    }

    private void appendNumber(String number) {
        String current = jTextField1.getText();
        
        if (calculator.isStartNewNumber() || current.equals("0")) {
            jTextField1.setText(number);
            calculator.setStartNewNumber(false);
            
            if (calculator.getHistory().isEmpty() || calculator.getHistory().endsWith(" = ")) {
                calculator.setHistory(number);
            } else {
                calculator.setHistory(calculator.getHistory() + number);
            }
        } else {
            jTextField1.setText(current + number);
            calculator.setHistory(calculator.getHistory() + number);
        }
        
        syncHistoryWithDisplay();
    }

    private void syncHistoryWithDisplay() {
        calculator.syncHistoryWithDisplay(jTextField1.getText());
        jTextField2.setText(calculator.getHistory());
    }

    private void setOperator(String op) {
        try {
            double value = Double.parseDouble(jTextField1.getText());
            calculator.setNum1(value);
            calculator.setOperator(op);
            calculator.setStartNewNumber(true);

            calculator.appendOperatorToHistory(op);
            jTextField2.setText(calculator.getHistory());

        } catch (NumberFormatException e) {
            showError("Input tidak valid");
        }
    }
    
    private void calculate() {
        try {
            double value = Double.parseDouble(jTextField1.getText());
            calculator.setNum2(value);
            
            double result = calculator.calculate();
            
            calculator.appendEqualsToHistory();
            jTextField2.setText(calculator.getHistory());
            
            displayResult(result);
            calculator.setOperator("");
            calculator.setStartNewNumber(true);
            
        } catch (NumberFormatException e) {
            showError("Input tidak valid");
        } catch (ArithmeticException e) {
            showError(e.getMessage());
        }
    }

    private void clear() {
        jTextField1.setText("0");
        jTextField2.setText("");
        calculator.clear();
    }

    private void deleteLastChar() {
        if (calculator.getHistory().contains("=")) {
            clear();
            return;
        }
        
        String current = jTextField1.getText();
        
        if (current.length() > 1) {
            jTextField1.setText(current.substring(0, current.length() - 1));
        } else {
            jTextField1.setText("0");
        }

        syncHistoryWithDisplay();
    }
    
    private void toggleSign() {
        try {
            double value = Double.parseDouble(jTextField1.getText());
            double result = calculator.toggleSign(value);
            displayResult(result);
            
            if (!calculator.getHistory().isEmpty()) {
                calculator.updateHistoryForToggleSign(jTextField1.getText());
                jTextField2.setText(calculator.getHistory());
            }
        } catch (NumberFormatException e) {
            showError("Input tidak valid");
        }
    }

    private void calculatePercent() {
        try {
            double value = Double.parseDouble(jTextField1.getText());
            double result = calculator.calculatePercent(value);
            
            displayResult(result);
            jTextField2.setText(calculator.getHistory());
            calculator.setStartNewNumber(true);
            
        } catch (NumberFormatException e) {
            showError("Input tidak valid");
        }
    }

    private void calculateTrig(String function) {
        try {
            double value = Double.parseDouble(jTextField1.getText());
            double result = calculator.calculateTrig(function, value);
            
            jTextField2.setText(calculator.getHistory());
            displayResult(result);
            calculator.setStartNewNumber(true);
            
        } catch (NumberFormatException e) {
            showError("Input tidak valid");
        }
    }

    private void calculatePower(int power) {
        try {
            double value = Double.parseDouble(jTextField1.getText());
            double result = calculator.calculatePower(value, power);
            
            jTextField2.setText(calculator.getHistory());
            displayResult(result);
            calculator.setStartNewNumber(true);
            
        } catch (NumberFormatException e) {
            showError("Input tidak valid");
        }
    }

    private void calculateRoot() {
        try {
            double value = Double.parseDouble(jTextField1.getText());
            double result = calculator.calculateRoot(value);
            
            jTextField2.setText(calculator.getHistory());
            displayResult(result);
            calculator.setStartNewNumber(true);
            
        } catch (NumberFormatException e) {
            showError("Input tidak valid");
        } catch (ArithmeticException e) {
            showError(e.getMessage());
        }
    }

    private void calculateLog() {
        try {
            double value = Double.parseDouble(jTextField1.getText());
            double result = calculator.calculateLog(value);
            
            jTextField2.setText(calculator.getHistory());
            displayResult(result);
            calculator.setStartNewNumber(true);
            
        } catch (NumberFormatException e) {
            showError("Input tidak valid");
        } catch (ArithmeticException e) {
            showError(e.getMessage());
        }
    }

    private void calculateExp() {
        try {
            double value = Double.parseDouble(jTextField1.getText());
            double result = calculator.calculateExp(value);
            
            jTextField2.setText(calculator.getHistory());
            displayResult(result);
            calculator.setStartNewNumber(true);
            
        } catch (NumberFormatException e) {
            showError("Input tidak valid");
        }
    }

    private void calculateFactorial() {
        try {
            int value = Integer.parseInt(jTextField1.getText());
            long result = calculator.calculateFactorial(value);
            
            jTextField2.setText(calculator.getHistory());
            displayResult(result);
            calculator.setStartNewNumber(true);
            
        } catch (NumberFormatException e) {
            showError("Input harus bilangan bulat");
        } catch (ArithmeticException e) {
            showError(e.getMessage());
        }
    }

    private void calculateReciprocal() {
        try {
            double value = Double.parseDouble(jTextField1.getText());
            double result = calculator.calculateReciprocal(value);
            
            jTextField2.setText(calculator.getHistory());
            displayResult(result);
            calculator.setStartNewNumber(true);
            
        } catch (NumberFormatException e) {
            showError("Input tidak valid");
        } catch (ArithmeticException e) {
            showError(e.getMessage());
        }
    }

    private void displayResult(double result) {
        jTextField1.setText(calculator.formatResult(result));
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
        clear();
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new TampilanForm().setVisible(true));
    }

    // Variables declaration - sama seperti file asli
    private javax.swing.JButton clearButton;
    private javax.swing.JButton cosButton;
    private javax.swing.JButton coshButton;
    private javax.swing.JButton delButton;
    private javax.swing.JButton divideButton;
    private javax.swing.JButton dotButton;
    private javax.swing.JButton eightButton;
    private javax.swing.JButton equalButton;
    private javax.swing.JButton expButton;
    private javax.swing.JButton factorialButton;
    private javax.swing.JButton fiveButton;
    private javax.swing.JButton fourButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton logButton;
    private javax.swing.JButton minusButton;
    private javax.swing.JButton multiplyButton;
    private javax.swing.JButton nineButton;
    private javax.swing.JButton oneButton;
    private javax.swing.JButton percentButton;
    private javax.swing.JButton plusButton;
    private javax.swing.JButton plusMinusButton;
    private javax.swing.JButton power2Button;
    private javax.swing.JButton power3Button;
    private javax.swing.JButton powerYButton;
    private javax.swing.JButton reciprocalButton;
    private javax.swing.JButton rootButton;
    private javax.swing.JButton sevenButton;
    private javax.swing.JButton sinButton;
    private javax.swing.JButton sinhButton;
    private javax.swing.JButton sixButton;
    private javax.swing.JButton tanButton;
    private javax.swing.JButton tanhButton;
    private javax.swing.JButton threeButton;
    private javax.swing.JButton twoButton;
    private javax.swing.JButton zeroButton;
}