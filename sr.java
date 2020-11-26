/*     */ import com.mojang.util.QueueLogAppender;
/*     */ import java.awt.BorderLayout;
/*     */ import java.awt.Component;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Font;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.FocusAdapter;
/*     */ import java.awt.event.FocusEvent;
/*     */ import java.awt.event.WindowAdapter;
/*     */ import java.awt.event.WindowEvent;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JList;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JScrollBar;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.JTextArea;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.SwingUtilities;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.border.EtchedBorder;
/*     */ import javax.swing.border.TitledBorder;
/*     */ import javax.swing.text.BadLocationException;
/*     */ import javax.swing.text.Document;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ public class sr
/*     */   extends JComponent
/*     */ {
/*  32 */   private static final Font a = new Font("Monospaced", 0, 12);
/*  33 */   private static final Logger b = LogManager.getLogger();
/*     */   
/*     */   private final so c;
/*     */   private Thread d;
/*     */   
/*     */   public static void a(so ☃) {
/*     */     try {
/*  40 */       UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
/*  41 */     } catch (Exception exception) {}
/*     */ 
/*     */     
/*  44 */     sr sr1 = new sr(☃);
/*  45 */     JFrame jFrame = new JFrame("Minecraft server");
/*  46 */     jFrame.add(sr1);
/*  47 */     jFrame.pack();
/*  48 */     jFrame.setLocationRelativeTo((Component)null);
/*  49 */     jFrame.setVisible(true);
/*  50 */     jFrame.addWindowListener(new WindowAdapter(☃)
/*     */         {
/*     */           public void windowClosing(WindowEvent ☃) {
/*  53 */             this.a.p();
/*  54 */             while (!this.a.ab()) {
/*     */               try {
/*  56 */                 Thread.sleep(100L);
/*  57 */               } catch (InterruptedException interruptedException) {
/*  58 */                 interruptedException.printStackTrace();
/*     */               } 
/*     */             } 
/*  61 */             System.exit(0);
/*     */           }
/*     */         });
/*  64 */     sr1.a();
/*     */   }
/*     */   
/*     */   public sr(so ☃) {
/*  68 */     this.c = ☃;
/*  69 */     setPreferredSize(new Dimension(854, 480));
/*     */     
/*  71 */     setLayout(new BorderLayout());
/*     */     try {
/*  73 */       add(d(), "Center");
/*  74 */       add(b(), "West");
/*  75 */     } catch (Exception exception) {
/*  76 */       b.error("Couldn't build server GUI", exception);
/*     */     } 
/*     */   }
/*     */   
/*     */   private JComponent b() throws Exception {
/*  81 */     JPanel ☃ = new JPanel(new BorderLayout());
/*  82 */     ☃.add(new st(this.c), "North");
/*  83 */     ☃.add(c(), "Center");
/*  84 */     ☃.setBorder(new TitledBorder(new EtchedBorder(), "Stats"));
/*  85 */     return ☃;
/*     */   }
/*     */   
/*     */   private JComponent c() throws Exception {
/*  89 */     JList<?> ☃ = new ss(this.c);
/*  90 */     JScrollPane jScrollPane = new JScrollPane(☃, 22, 30);
/*  91 */     jScrollPane.setBorder(new TitledBorder(new EtchedBorder(), "Players"));
/*     */     
/*  93 */     return jScrollPane;
/*     */   }
/*     */   
/*     */   private JComponent d() throws Exception {
/*  97 */     JPanel ☃ = new JPanel(new BorderLayout());
/*  98 */     JTextArea jTextArea = new JTextArea();
/*  99 */     JScrollPane jScrollPane = new JScrollPane(jTextArea, 22, 30);
/* 100 */     jTextArea.setEditable(false);
/* 101 */     jTextArea.setFont(a);
/*     */     
/* 103 */     JTextField jTextField = new JTextField();
/* 104 */     jTextField.addActionListener(actionEvent -> {
/*     */           String str = ☃.getText().trim();
/*     */           
/*     */           if (!str.isEmpty()) {
/*     */             this.c.a(str, this.c.aJ());
/*     */           }
/*     */           ☃.setText("");
/*     */         });
/* 112 */     jTextArea.addFocusListener(new FocusAdapter(this)
/*     */         {
/*     */           public void focusGained(FocusEvent ☃) {}
/*     */         });
/*     */ 
/*     */     
/* 118 */     ☃.add(jScrollPane, "Center");
/* 119 */     ☃.add(jTextField, "South");
/* 120 */     ☃.setBorder(new TitledBorder(new EtchedBorder(), "Log and chat"));
/*     */     
/* 122 */     this.d = new Thread(() -> {
/*     */           String str;
/*     */           while ((str = QueueLogAppender.getNextLogEvent("ServerGuiConsole")) != null) {
/*     */             a(☃, jScrollPane, str);
/*     */           }
/*     */         });
/* 128 */     this.d.setUncaughtExceptionHandler(new e(b));
/* 129 */     this.d.setDaemon(true);
/* 130 */     return ☃;
/*     */   }
/*     */   
/*     */   public void a() {
/* 134 */     this.d.start();
/*     */   }
/*     */   
/*     */   public void a(JTextArea ☃, JScrollPane jScrollPane, String str) {
/* 138 */     if (!SwingUtilities.isEventDispatchThread()) {
/* 139 */       SwingUtilities.invokeLater(() -> a(☃, jScrollPane, str));
/*     */       
/*     */       return;
/*     */     } 
/* 143 */     Document document = ☃.getDocument();
/* 144 */     JScrollBar jScrollBar = jScrollPane.getVerticalScrollBar();
/* 145 */     boolean bool = false;
/*     */     
/* 147 */     if (jScrollPane.getViewport().getView() == ☃) {
/* 148 */       bool = (jScrollBar.getValue() + jScrollBar.getSize().getHeight() + (a.getSize() * 4) > jScrollBar.getMaximum());
/*     */     }
/*     */     
/*     */     try {
/* 152 */       document.insertString(document.getLength(), str, null);
/* 153 */     } catch (BadLocationException badLocationException) {}
/*     */ 
/*     */     
/* 156 */     if (bool)
/* 157 */       jScrollBar.setValue(2147483647); 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\sr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */