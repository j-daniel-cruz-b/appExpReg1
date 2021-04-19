/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leasons;

import dialogs.EndDialog;
import dialogs.EndFrame;
import java.awt.Color;
import java.awt.Image;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import main.MainMenu;

/**
 *
 * @author DEVELOP17
 */
public class LessonFVwords extends javax.swing.JFrame {

    /**
     * Creates new form LessonFVwords
     */
    int level = 1;
    EndFrame pantallaFinal;
    MainMenu menu;
    LessonFV palabras;
    String NOMBRE_USUARIO;

    public LessonFVwords(String nUsuario) {
        initComponents();
        NOMBRE_USUARIO = nUsuario;
        this.setTitle("DUBI - Frutas y Verduras [" + nUsuario + "]");
        getContentPane().setBackground(new Color(204, 138, 249));
        Image icon = new ImageIcon(getClass().getResource("../images/logo.png")).getImage();
        setIconImage(icon);
        this.panelManzana.setVisible(true);
        this.panelArbol.setVisible(false);
        this.panelNaranja.setVisible(false);
        this.panelVerduras.setVisible(false);
        this.panelBrocoli.setVisible(false);
        this.panelArbusto.setVisible(false);
        this.panelLechuga.setVisible(false);
        this.btnSiguiente.setEnabled(false);
        this.labelError.setVisible(false);
        this.labelCorrecto.setVisible(false);
    }

    public void arbol() {
        this.label1.setText("Arbol");
        this.label2.setText("Maíz");
        this.label3.setText("Brocolí");
        this.labelImg.setIcon(new ImageIcon("src/images/bigs/arbol.png"));
        this.panelArbol.setVisible(true);
        this.btnSiguiente.setEnabled(false);
        this.labelError.setVisible(false);
        this.labelCorrecto.setVisible(false);
    }

    public void naranja() {
        this.label1.setText("Pera");
        this.label2.setText("Naranja");
        this.label3.setText("Manzana");
        this.labelImg.setIcon(new ImageIcon("src/images/bigs/naranja.png"));
        this.panelNaranja.setVisible(true);
        this.btnSiguiente.setEnabled(false);
        this.labelError.setVisible(false);
        this.labelCorrecto.setVisible(false);
    }

    public void brocoli() {
        this.label1.setText("Limón");
        this.label2.setText("Lechuga");
        this.label3.setText("Brocoli");
        this.labelImg.setIcon(new ImageIcon("src/images/bigs/brocoli.png"));
        this.panelFrutas.setVisible(false);
        this.panelVerduras.setVisible(true);
        this.panelBrocoli.setVisible(true);
        this.btnSiguiente.setEnabled(false);
        this.labelError.setVisible(false);
        this.labelCorrecto.setVisible(false);
    }

    public void arbusto() {
        this.label1.setText("Pepino");
        this.label2.setText("Calabaza");
        this.label3.setText("Arbusto");
        this.labelImg.setIcon(new ImageIcon("src/images/bigs/arbusto.png"));
        this.panelFrutas.setVisible(false);
        this.panelVerduras.setVisible(true);
        this.panelArbusto.setVisible(true);
        this.btnSiguiente.setEnabled(false);
        this.labelError.setVisible(false);
        this.labelCorrecto.setVisible(false);
    }

    public void lechuga() {
        this.label1.setText("Lechuga");
        this.label2.setText("Cilantro");
        this.label3.setText("Manzana");
        this.labelImg.setIcon(new ImageIcon("src/images/bigs/lechuga.png"));
        this.panelFrutas.setVisible(false);
        this.panelVerduras.setVisible(true);
        this.panelLechuga.setVisible(true);
        this.btnSiguiente.setEnabled(false);
        this.labelError.setVisible(false);
        this.labelCorrecto.setVisible(false);
    }
    
    public void pantallaFinal(){
        pantallaFinal = new EndFrame(NOMBRE_USUARIO, 1);
        pantallaFinal.setVisible(true);
        this.dispose();
    }

    private void manzanaRevisar() {
        String cadena = this.textManzana.getText();
        String regExpString = "[a-zA-Z]{7}";
        Pattern pStr = Pattern.compile(regExpString);
        Matcher mStr = pStr.matcher(cadena);
        if (mStr.matches()) {
            cadena = cadena.toLowerCase().strip();
            if(!cadena.equals("manzana")){
                this.labelError.setVisible(true);
                this.labelError.setText("No es correcto :c");
            } else {
                this.btnSiguiente.setEnabled(true);
                this.labelCorrecto.setVisible(true);
                this.labelCorrecto.setText("Muy Bien!!");
                this.textManzana.setEnabled(false);
            }
        } else {
            this.labelError.setVisible(true);
            this.labelError.setText("Faltan letras :c");
        }
    }

    private void arbolRevisar() {
        String cadena = this.textArbol.getText();
        String regExpString = "[a-zA-Z]{5}";
        Pattern pStr = Pattern.compile(regExpString);
        Matcher mStr = pStr.matcher(cadena);
        if (mStr.matches()) {
            cadena = cadena.toLowerCase().strip();
            if(!cadena.equals("arbol")){
                this.labelError.setVisible(true);
                this.labelError.setText("No es correcto :c");
            } else {
                this.btnSiguiente.setEnabled(true);
                this.labelCorrecto.setVisible(true);
                this.labelCorrecto.setText("Muy Bien!!");
                this.textArbol.setEnabled(false);
            }
        } else {
            this.labelError.setVisible(true);
            this.labelError.setText("Faltan letras :c");
        }
    }
    
    private void naranjaRevisar() {
        String cadena = this.textNaranja.getText();
        String regExpString = "[a-zA-Z]{7}";
        Pattern pStr = Pattern.compile(regExpString);
        Matcher mStr = pStr.matcher(cadena);
        if (mStr.matches()) {
            cadena = cadena.toLowerCase().strip();
            if(!cadena.equals("naranja")){
                this.labelError.setVisible(true);
                this.labelError.setText("No es correcto :c");
            } else {
                this.btnSiguiente.setEnabled(true);
                this.labelCorrecto.setVisible(true);
                this.labelCorrecto.setText("Muy Bien!!");
                this.textNaranja.setEnabled(false);
            }
        } else {
            this.labelError.setVisible(true);
            this.labelError.setText("Faltan letras :c");
        }
    }

    private void brocoliRevisar() {
        String cadena = this.textBrocoli.getText();
        String regExpString = "[a-zA-Z]{7}";
        Pattern pStr = Pattern.compile(regExpString);
        Matcher mStr = pStr.matcher(cadena);
        if (mStr.matches()) {
            cadena = cadena.toLowerCase().strip();
            if(!cadena.equals("brocoli")){
                this.labelError.setVisible(true);
                this.labelError.setText("No es correcto :c");
            } else {
                this.btnSiguiente.setEnabled(true);
                this.labelCorrecto.setVisible(true);
                this.labelCorrecto.setText("Muy Bien!!");
            }
        } else {
            this.labelError.setVisible(true);
            this.labelError.setText("Faltan letras :c");
        }
    }

    private void arbustoRevisar() {
        String cadena = this.textArbusto.getText();
        String regExpString = "[a-zA-Z]{7}";
        Pattern pStr = Pattern.compile(regExpString);
        Matcher mStr = pStr.matcher(cadena);
        if (mStr.matches()) {
            cadena = cadena.toLowerCase().strip();
            if(!cadena.equals("arbusto")){
                this.labelError.setVisible(true);
                this.labelError.setText("No es correcto :c");
            } else {
                this.btnSiguiente.setEnabled(true);
                this.labelCorrecto.setVisible(true);
                this.labelCorrecto.setText("Muy Bien!!");
            }
        } else {
            this.labelError.setVisible(true);
            this.labelError.setText("Faltan letras :c");
        }
        
    }

    private void lechugaRevisar() {
        String cadena = this.textLechuga.getText();
        String regExpString = "[a-zA-Z]{7}";
        Pattern pStr = Pattern.compile(regExpString);
        Matcher mStr = pStr.matcher(cadena);
        if (mStr.matches()) {
            cadena = cadena.toLowerCase().strip();
            if(!cadena.equals("lechuga")){
                this.labelError.setVisible(true);
                this.labelError.setText("No es correcto :c");
            } else {
                this.btnSiguiente.setEnabled(true);
                this.labelCorrecto.setVisible(true);
                this.labelCorrecto.setText("Muy Bien!!");
            }
        } else {
            this.labelError.setVisible(true);
            this.labelError.setText("Faltan letras :c");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelImg = new javax.swing.JLabel();
        btnRevisar = new javax.swing.JButton();
        labelError = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        label3 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        btnRegresarPalabras = new javax.swing.JButton();
        btnRegresarMenu = new javax.swing.JButton();
        labelCorrecto = new javax.swing.JLabel();
        panelFrutas = new javax.swing.JPanel();
        panelNaranja = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        textNaranja = new javax.swing.JTextField();
        panelManzana = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        textManzana = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        panelArbol = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        textArbol = new javax.swing.JTextField();
        panelVerduras = new javax.swing.JPanel();
        panelLechuga = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        textLechuga = new javax.swing.JTextField();
        panelBrocoli = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        textBrocoli = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        panelArbusto = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        textArbusto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(570, 458));
        setPreferredSize(new java.awt.Dimension(570, 458));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 200));

        labelImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bigs/manzana.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelImg, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnRevisar.setBackground(new java.awt.Color(255, 153, 153));
        btnRevisar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnRevisar.setText("Revisar");
        btnRevisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRevisarActionPerformed(evt);
            }
        });

        labelError.setBackground(new java.awt.Color(255, 0, 0));
        labelError.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        labelError.setForeground(new java.awt.Color(255, 255, 255));
        labelError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelError.setText("No escribas números :c");
        labelError.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(255, 102, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Posibles Palabras", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 14))); // NOI18N

        label3.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label3.setText("Manzana");

        label1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label1.setText("Lechuga");
        label1.setMaximumSize(new java.awt.Dimension(100, 34));
        label1.setMinimumSize(new java.awt.Dimension(100, 34));
        label1.setPreferredSize(new java.awt.Dimension(100, 34));

        label2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label2.setText("Árbol");
        label2.setMaximumSize(new java.awt.Dimension(100, 34));
        label2.setMinimumSize(new java.awt.Dimension(100, 34));
        label2.setPreferredSize(new java.awt.Dimension(100, 34));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(label3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3))
                .addContainerGap())
        );

        btnSiguiente.setBackground(new java.awt.Color(255, 153, 153));
        btnSiguiente.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnRegresarPalabras.setBackground(new java.awt.Color(255, 153, 153));
        btnRegresarPalabras.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnRegresarPalabras.setText("Regresar a la Palabras");
        btnRegresarPalabras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarPalabrasActionPerformed(evt);
            }
        });

        btnRegresarMenu.setBackground(new java.awt.Color(255, 153, 153));
        btnRegresarMenu.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnRegresarMenu.setText("Regresar al Menú Principal");
        btnRegresarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarMenuActionPerformed(evt);
            }
        });

        labelCorrecto.setBackground(new java.awt.Color(0, 204, 0));
        labelCorrecto.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        labelCorrecto.setForeground(new java.awt.Color(255, 255, 255));
        labelCorrecto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCorrecto.setText("MuyBn!");
        labelCorrecto.setOpaque(true);

        panelFrutas.setBackground(new java.awt.Color(255, 204, 51));

        panelNaranja.setBackground(new java.awt.Color(255, 204, 51));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setText("al igual que la");

        textNaranja.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        textNaranja.setMinimumSize(new java.awt.Dimension(80, 24));
        textNaranja.setPreferredSize(new java.awt.Dimension(80, 24));
        textNaranja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textNaranjaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelNaranjaLayout = new javax.swing.GroupLayout(panelNaranja);
        panelNaranja.setLayout(panelNaranjaLayout);
        panelNaranjaLayout.setHorizontalGroup(
            panelNaranjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNaranjaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(textNaranja, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelNaranjaLayout.setVerticalGroup(
            panelNaranjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNaranjaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNaranjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textNaranja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelManzana.setBackground(new java.awt.Color(255, 204, 51));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setText("es una fruta,");

        textManzana.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        textManzana.setMaximumSize(new java.awt.Dimension(80, 24));
        textManzana.setMinimumSize(new java.awt.Dimension(80, 24));
        textManzana.setPreferredSize(new java.awt.Dimension(80, 24));
        textManzana.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textManzanaFocusGained(evt);
            }
        });
        textManzana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textManzanaMouseClicked(evt);
            }
        });
        textManzana.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                textManzanaInputMethodTextChanged(evt);
            }
        });
        textManzana.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                textManzanaPropertyChange(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText("La");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout panelManzanaLayout = new javax.swing.GroupLayout(panelManzana);
        panelManzana.setLayout(panelManzanaLayout);
        panelManzanaLayout.setHorizontalGroup(
            panelManzanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelManzanaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textManzana, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        panelManzanaLayout.setVerticalGroup(
            panelManzanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelManzanaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelManzanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelManzanaLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(textManzana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelManzanaLayout.createSequentialGroup()
                        .addGroup(panelManzanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        panelArbol.setBackground(new java.awt.Color(255, 204, 51));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setText("crecen en un");

        textArbol.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        textArbol.setMinimumSize(new java.awt.Dimension(80, 24));
        textArbol.setPreferredSize(new java.awt.Dimension(80, 24));
        textArbol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textArbolMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelArbolLayout = new javax.swing.GroupLayout(panelArbol);
        panelArbol.setLayout(panelArbolLayout);
        panelArbolLayout.setHorizontalGroup(
            panelArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelArbolLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(textArbol, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelArbolLayout.setVerticalGroup(
            panelArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelArbolLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textArbol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelFrutasLayout = new javax.swing.GroupLayout(panelFrutas);
        panelFrutas.setLayout(panelFrutasLayout);
        panelFrutasLayout.setHorizontalGroup(
            panelFrutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFrutasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFrutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelManzana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelArbol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelNaranja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelFrutasLayout.setVerticalGroup(
            panelFrutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFrutasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelManzana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(panelArbol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(panelNaranja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelVerduras.setBackground(new java.awt.Color(255, 204, 0));

        panelLechuga.setBackground(new java.awt.Color(255, 204, 0));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel6.setText("al igual que la");

        textLechuga.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        textLechuga.setMinimumSize(new java.awt.Dimension(80, 24));
        textLechuga.setPreferredSize(new java.awt.Dimension(80, 24));
        textLechuga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textLechugaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelLechugaLayout = new javax.swing.GroupLayout(panelLechuga);
        panelLechuga.setLayout(panelLechugaLayout);
        panelLechugaLayout.setHorizontalGroup(
            panelLechugaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLechugaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(textLechuga, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLechugaLayout.setVerticalGroup(
            panelLechugaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLechugaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLechugaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textLechuga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelBrocoli.setBackground(new java.awt.Color(255, 204, 0));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setText("es una verdura,");

        textBrocoli.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        textBrocoli.setMinimumSize(new java.awt.Dimension(80, 24));
        textBrocoli.setPreferredSize(new java.awt.Dimension(80, 24));
        textBrocoli.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textBrocoliFocusGained(evt);
            }
        });
        textBrocoli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textBrocoliMouseClicked(evt);
            }
        });
        textBrocoli.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                textBrocoliInputMethodTextChanged(evt);
            }
        });
        textBrocoli.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                textBrocoliPropertyChange(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel7.setText("El");
        jLabel7.setToolTipText("");

        javax.swing.GroupLayout panelBrocoliLayout = new javax.swing.GroupLayout(panelBrocoli);
        panelBrocoli.setLayout(panelBrocoliLayout);
        panelBrocoliLayout.setHorizontalGroup(
            panelBrocoliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBrocoliLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textBrocoli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        panelBrocoliLayout.setVerticalGroup(
            panelBrocoliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBrocoliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBrocoliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(textBrocoli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelArbusto.setBackground(new java.awt.Color(255, 204, 0));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel8.setText("crecen en un");

        textArbusto.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        textArbusto.setMinimumSize(new java.awt.Dimension(80, 24));
        textArbusto.setPreferredSize(new java.awt.Dimension(80, 24));
        textArbusto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textArbustoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textArbustoMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout panelArbustoLayout = new javax.swing.GroupLayout(panelArbusto);
        panelArbusto.setLayout(panelArbustoLayout);
        panelArbustoLayout.setHorizontalGroup(
            panelArbustoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelArbustoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(textArbusto, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelArbustoLayout.setVerticalGroup(
            panelArbustoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelArbustoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelArbustoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(textArbusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelVerdurasLayout = new javax.swing.GroupLayout(panelVerduras);
        panelVerduras.setLayout(panelVerdurasLayout);
        panelVerdurasLayout.setHorizontalGroup(
            panelVerdurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerdurasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelVerdurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBrocoli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelArbusto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelLechuga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelVerdurasLayout.setVerticalGroup(
            panelVerdurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerdurasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBrocoli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(panelArbusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(panelLechuga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnRegresarPalabras)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(panelFrutas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(panelVerduras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(labelError, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(labelCorrecto))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(btnRegresarMenu)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(btnRevisar)
                                                    .addGap(134, 134, 134)
                                                    .addComponent(btnSiguiente))))
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelFrutas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelVerduras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelError)
                            .addComponent(labelCorrecto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRevisar)
                            .addComponent(btnSiguiente)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 31, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresarPalabras)
                    .addComponent(btnRegresarMenu))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        switch (level) {
            case 1:
                arbol();
                level++;
                break;
            case 2:
                naranja();
                level++;
                break;
            case 3:
                brocoli();
                level++;
                break;
            case 4:
                arbusto();
                level++;
                break;
            case 5:
                lechuga();
                level++;
                break;
            case 6:
                pantallaFinal();
                break;
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnRevisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRevisarActionPerformed
        switch (level) {
            case 1:
                manzanaRevisar();
                break;
            case 2:
                arbolRevisar();
                break;
            case 3:
                naranjaRevisar();
                break;
            case 4:
                brocoliRevisar();
                break;
            case 5:
                arbustoRevisar();
                break;
            case 6:
                lechugaRevisar();
                break;
        }
    }//GEN-LAST:event_btnRevisarActionPerformed

    private void btnRegresarPalabrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarPalabrasActionPerformed
        palabras = new LessonFV(NOMBRE_USUARIO);
        palabras.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarPalabrasActionPerformed

    private void btnRegresarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarMenuActionPerformed
        menu = new MainMenu(NOMBRE_USUARIO);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarMenuActionPerformed

    private void textManzanaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_textManzanaPropertyChange
    }//GEN-LAST:event_textManzanaPropertyChange

    private void textManzanaInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_textManzanaInputMethodTextChanged
    }//GEN-LAST:event_textManzanaInputMethodTextChanged

    private void textManzanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textManzanaMouseClicked
        this.labelError.setVisible(false);
        this.labelCorrecto.setVisible(false);
    }//GEN-LAST:event_textManzanaMouseClicked

    private void textManzanaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textManzanaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_textManzanaFocusGained

    private void textBrocoliFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textBrocoliFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_textBrocoliFocusGained

    private void textBrocoliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textBrocoliMouseClicked
       this.labelError.setVisible(false);
        this.labelCorrecto.setVisible(false);
    }//GEN-LAST:event_textBrocoliMouseClicked

    private void textBrocoliInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_textBrocoliInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_textBrocoliInputMethodTextChanged

    private void textBrocoliPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_textBrocoliPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_textBrocoliPropertyChange

    private void textArbolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textArbolMouseClicked
        this.labelError.setVisible(false);
        this.labelCorrecto.setVisible(false);
    }//GEN-LAST:event_textArbolMouseClicked

    private void textNaranjaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textNaranjaMouseClicked
        this.labelError.setVisible(false);
        this.labelCorrecto.setVisible(false);
    }//GEN-LAST:event_textNaranjaMouseClicked

    private void textArbustoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textArbustoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_textArbustoMouseEntered

    private void textArbustoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textArbustoMouseClicked
        this.labelError.setVisible(false);
        this.labelCorrecto.setVisible(false);
    }//GEN-LAST:event_textArbustoMouseClicked

    private void textLechugaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textLechugaMouseClicked
        this.labelError.setVisible(false);
        this.labelCorrecto.setVisible(false);
    }//GEN-LAST:event_textLechugaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LessonFVwords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LessonFVwords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LessonFVwords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LessonFVwords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LessonFVwords("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresarMenu;
    private javax.swing.JButton btnRegresarPalabras;
    private javax.swing.JButton btnRevisar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel labelCorrecto;
    private javax.swing.JLabel labelError;
    private javax.swing.JLabel labelImg;
    private javax.swing.JPanel panelArbol;
    private javax.swing.JPanel panelArbusto;
    private javax.swing.JPanel panelBrocoli;
    private javax.swing.JPanel panelFrutas;
    private javax.swing.JPanel panelLechuga;
    private javax.swing.JPanel panelManzana;
    private javax.swing.JPanel panelNaranja;
    private javax.swing.JPanel panelVerduras;
    private javax.swing.JTextField textArbol;
    private javax.swing.JTextField textArbusto;
    private javax.swing.JTextField textBrocoli;
    private javax.swing.JTextField textLechuga;
    private javax.swing.JTextField textManzana;
    private javax.swing.JTextField textNaranja;
    // End of variables declaration//GEN-END:variables
}
