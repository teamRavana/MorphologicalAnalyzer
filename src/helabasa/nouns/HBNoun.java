 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   *    
   * /  
 p a c k a g e   h e l a b a s a . n o u n s ;  
  
 i m p o r t   h e l a b a s a . H B C o r p u s ;  
 i m p o r t   h e l a b a s a . H B F o r m ;  
 i m p o r t   h e l a b a s a . H B F o r m C o n t a i n e r ;  
 i m p o r t   h e l a b a s a . H B I r r e g u l a r F o r m ;  
 i m p o r t   h e l a b a s a . H B P O S ;  
 i m p o r t   h e l a b a s a . H B R e g u l a r F o r m ;  
 i m p o r t   h e l a b a s a . H B T r a n s f o r m R u l e ;  
 i m p o r t   h e l a b a s a . H B T r a n s f o r m R u l e S e t ;  
 i m p o r t   h e l a b a s a . H B W o r d ;  
 i m p o r t   h e l a b a s a . H B W o r d D a t a b a s e ;  
 i m p o r t   h e l a b a s a . H e l a b a s a ;  
  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . I t e r a t o r ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
  
 p u b l i c   c l a s s   H B N o u n   e x t e n d s   H B P O S   {  
 	  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g   H B S _ C O N J _ P R   	 =   " P R " ;  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g   H B S _ C O N J _ K R   	 =   " K R " ;  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g   H B S _ C O N J _ K T   	 =   " K T " ;  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g   H B S _ C O N J _ K A   	 =   " K A " ;  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g   H B S _ C O N J _ S P   	 =   " S P " ;  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g   H B S _ C O N J _ A V   	 =   " A V " ;  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g   H B S _ C O N J _ S M   	 =   " S M " ;  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g   H B S _ C O N J _ A D   	 =   " A D " ;  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g   H B S _ C O N J _ A L   	 =   " A L " ;  
 	  
 	 p u b l i c   s t a t i c   f i n a l   i n t   H B I _ C O N J _ P R   	 =   0 ;  
 	 p u b l i c   s t a t i c   f i n a l   i n t   H B I _ C O N J _ K R   	 =   1 ;  
 	 p u b l i c   s t a t i c   f i n a l   i n t   H B I _ C O N J _ K T   	 =   2 ;  
 	 p u b l i c   s t a t i c   f i n a l   i n t   H B I _ C O N J _ K A   	 =   3 ;  
 	 p u b l i c   s t a t i c   f i n a l   i n t   H B I _ C O N J _ S P   	 =   4 ;  
 	 p u b l i c   s t a t i c   f i n a l   i n t   H B I _ C O N J _ A V   	 =   5 ;  
 	 p u b l i c   s t a t i c   f i n a l   i n t   H B I _ C O N J _ S M   	 =   6 ;  
 	 p u b l i c   s t a t i c   f i n a l   i n t   H B I _ C O N J _ A D   	 =   7 ;  
 	 p u b l i c   s t a t i c   f i n a l   i n t   H B I _ C O N J _ A L   	 =   8 ; 	  
 	  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g   H B S _ C A T _ S I N G   	 	 =   " D S " ;  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g   H B S _ C A T _ I N D E F _ S I N G   	 =   " I S " ;  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g   H B S _ C A T _ P L U R A L   	 	 =   " P L " ;  
 	  
 	 p u b l i c   s t a t i c   f i n a l   i n t   H B I _ C A T _ S I N G   	 	 =   0 ;  
 	 p u b l i c   s t a t i c   f i n a l   i n t   H B I _ C A T _ I N D E F _ S I N G   	 =   1 ;  
 	 p u b l i c   s t a t i c   f i n a l   i n t   H B I _ C A T _ P L U R A L   	 	 =   2 ;  
 	  
 	  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g [ ]   a r r _ V i b h a k t h i   =   { H B S _ C O N J _ P R ,   H B S _ C O N J _ K R ,   H B S _ C O N J _ K T ,   H B S _ C O N J _ K A ,   H B S _ C O N J _ S P ,    
 	 	 H B S _ C O N J _ A V ,   H B S _ C O N J _ A V ,   H B S _ C O N J _ A D ,   H B S _ C O N J _ A L } ;  
 	  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g [ ]   a r r _ N o u n C a t e g o r i e s   =   { H B S _ C A T _ S I N G ,   H B S _ C A T _ I N D E F _ S I N G ,   H B S _ C A T _ P L U R A L } ;  
 	  
 	 p r i v a t e   H B F o r m C o n t a i n e r   o _ F o r m s   =   n e w   H B F o r m C o n t a i n e r ( ) ;  
 	  
 	 p u b l i c   H B N o u n ( )   {  
 	 	 S e t T y p e ( H B P O S . P O S _ N O U N ) ;  
 	 }  
  
 	 p u b l i c   v o i d   S e t R u l e S e t ( H B T r a n s f o r m R u l e S e t   o R u l e S e t )  
 	 {  
 	 	 o _ R u l e S e t   =   o R u l e S e t ;  
 	 }  
 	  
 	 p u b l i c   H B T r a n s f o r m R u l e S e t   G e t R u l e S e t ( )  
 	 {  
 	 	 r e t u r n   o _ R u l e S e t ;  
 	 }  
 	  
 	 p u b l i c   l o n g   G e t L e m m a I D ( )  
 	 {  
 	 	 r e t u r n   H B W o r d D a t a b a s e . G e t L e m m a I D ( t h i s ) ; 	 	  
 	 }  
  
 	 p u b l i c   v o i d   G e n e r a t e F o r m s ( )  
 	 { 	 	  
 	 	 / / S t e p   1 .   F i l l   w i t h   u s e r   d e f i n e d   f o r m s  
 	 	 L i s t < H B I r r e g u l a r F o r m >   l s t I F   =   H B W o r d D a t a b a s e . G e t I r r e g u l a r F o r m s ( t h i s ) ;  
 	 	  
 	 	 i f ( l s t I F ! = n u l l )  
 	 	 {  
 	 	 	 f o r   ( I t e r a t o r < H B I r r e g u l a r F o r m >   i t e r   =   l s t I F . i t e r a t o r ( ) ;   i t e r . h a s N e x t ( ) ;   )    
 	 	 	 {  
 	 	 	 	 H B I r r e g u l a r F o r m   o F o r m   =   i t e r . n e x t ( ) ;  
 	 	 	 	 o _ F o r m s . A d d F o r m ( o F o r m . G e t T y p e ( ) ,   o F o r m . G e t S u b T y p e ( ) ,   o F o r m ) ;  
 	 	 	 }  
 	 	 }  
 	 	  
 	 	 / / S t e p   2 .   G e n e r a t e   t h e   r e m a i n i n g   p a r t   u s i n g   r u l e s 	 	 	 	  
 	 	 i n t   i C o u n t   =   o _ R u l e S e t . G e t R u l e C o u n t ( ) ; 	 	  
 	 	  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B T r a n s f o r m R u l e   o R u l e   =   o _ R u l e S e t . G e t R u l e ( i ) ;  
 	 	 	  
 	 	 	 i f ( o _ F o r m s . G e t F o r m s ( o R u l e . G e t T y p e ( ) ,   o R u l e . G e t S u b T y p e ( ) ) = = n u l l )  
 	 	 	 {  
 	 	 	 	 L i s t < H B W o r d >   o W o r d L i s t   =   o R u l e . G e n e r a t e F o r m ( o _ L e m m a ,   1 ) ; 	 	  
 	 	 	 	 i f ( o W o r d L i s t ! = n u l l   & &   o W o r d L i s t . s i z e ( ) > 0 )  
 	 	 	 	 {  
 	 	 	 	 	 f o r ( i n t   j = 0 ;   j < o W o r d L i s t . s i z e ( ) ;   j + + )  
 	 	 	 	 	 {  
 	 	 	 	 	 	 H B R e g u l a r F o r m   o F o r m   =   n e w   H B R e g u l a r F o r m ( o R u l e ,   o W o r d L i s t . g e t ( j ) ) ;  
 	 	 	 	 	 	 o _ F o r m s . A d d F o r m ( o R u l e . G e t T y p e ( ) ,   o R u l e . G e t S u b T y p e ( ) ,   o F o r m ) ; 	 	 	 	 	 	  
 	 	 	 	 	 }  
 	 	 	 	 } 	  
 	 	 	 }  
 	 	 	  
 	 	 }  
 	 	  
 	 	 S e t S c o r e ( o _ F o r m s . G e t S c o r e ( ) ) ;  
 	 }  
 	  
 	 p u b l i c   H B F o r m   G e t F o r m ( i n t   i T y p e ,   i n t   i S u b T y p e )  
 	 {  
 	 	 r e t u r n   n u l l ;  
 	 }  
 	  
 	 p u b l i c   L i s t < H B F o r m >   G e t N o u n F o r m s ( i n t   i T y p e ,   i n t   i S u b T y p e )  
 	 {  
 	 	 r e t u r n   o _ F o r m s . G e t F o r m s ( i T y p e ,   i S u b T y p e ) ;  
 	 	  
 / / 	 	 / / T O D O  
 / / 	 	 / / C h e c k   i f   t h e r e   a r e   o v e r w r i t t e n   f o r m s  
 / / 	 	  
 / / 	 	  
 / / 	 	 L i s t < H B T r a n s f o r m R u l e >   l s t R u l e s   =   n e w   A r r a y L i s t < H B T r a n s f o r m R u l e > ( ) ;  
 / / 	 	 o _ R u l e S e t . F i n d R u l e s ( i T y p e ,   i S u b T y p e ,   l s t R u l e s ) ;  
 / / 	 	 i n t   i C o u n t   =   l s t R u l e s . s i z e ( ) ; 	 	  
 / / 	 	 i f ( i C o u n t > 0 )  
 / / 	 	 { 	  
 / / 	 	 	 L i s t < H B F o r m >   l i s t W o r d s   =   n e w   A r r a y L i s t < H B F o r m > ( ) ;  
 / / 	 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 / / 	 	 	 {  
 / / 	 	 	 	 H B T r a n s f o r m R u l e   o R u l e   =   l s t R u l e s . g e t ( i ) ;  
 / / 	 	 	 	 L i s t < H B W o r d >   o W o r d L i s t   =   o R u l e . G e n e r a t e F o r m ( o _ L e m m a ,   1 ) ; 	 	  
 / / 	 	 	 	 i f ( o W o r d L i s t ! = n u l l   & &   o W o r d L i s t . s i z e ( ) > 0 )  
 / / 	 	 	 	 {  
 / / 	 	 	 	 	 f o r ( i n t   j = 0 ;   j < o W o r d L i s t . s i z e ( ) ;   j + + )  
 / / 	 	 	 	 	 {  
 / / 	 	 	 	 	 	 H B R e g u l a r F o r m   o F o r m   =   n e w   H B R e g u l a r F o r m ( o R u l e ,   o W o r d L i s t . g e t ( j ) ) ;  
 / / 	 	 	 	 	 	  
 / / 	 	 	 	 	 	 l i s t W o r d s . a d d ( o F o r m ) ;  
 / / 	 	 	 	 	 	 / / l i s t W o r d s . a d d ( o W o r d L i s t . g e t ( j ) . G e t N a t u r a l F o r m ( ) ) ;  
 / / 	 	 	 	 	 }  
 / / 	 	 	 	 }  
 / / 	 	 	 } 	 	 	  
 / / 	 	 	 r e t u r n   l i s t W o r d s ;  
 / / 	 	 }  
 / / 	 	 e l s e  
 / / 	 	 {  
 / / 	 	 	 r e t u r n   n u l l ;  
 / / 	 	 }  
 	 } 	  
  
 	  
 	 p u b l i c   L i s t < S t r i n g >   G e t N o u n F o r m S t r i n g s ( i n t   i T y p e ,   i n t   i S u b T y p e )  
 	 {  
 	 	 L i s t < H B T r a n s f o r m R u l e >   l s t R u l e s   =   n e w   A r r a y L i s t < H B T r a n s f o r m R u l e > ( ) ;  
 	 	 o _ R u l e S e t . F i n d R u l e s ( i T y p e ,   i S u b T y p e ,   l s t R u l e s ) ;  
 	 	 i n t   i C o u n t   =   l s t R u l e s . s i z e ( ) ; 	 	  
 	 	 i f ( i C o u n t > 0 )  
 	 	 { 	  
 	 	 	 L i s t < S t r i n g >   l i s t W o r d s   =   n e w   A r r a y L i s t < S t r i n g > ( ) ;  
 	 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 	 {  
 	 	 	 	 H B T r a n s f o r m R u l e   o R u l e   =   l s t R u l e s . g e t ( i ) ;  
 	 	 	 	 L i s t < H B W o r d >   o W o r d L i s t   =   o R u l e . G e n e r a t e F o r m ( o _ L e m m a ,   1 ) ; 	 	  
 	 	 	 	 i f ( o W o r d L i s t ! = n u l l   & &   o W o r d L i s t . s i z e ( ) > 0 )  
 	 	 	 	 {  
 	 	 	 	 	 f o r ( i n t   j = 0 ;   j < o W o r d L i s t . s i z e ( ) ;   j + + )  
 	 	 	 	 	 {  
 	 	 	 	 	 	 l i s t W o r d s . a d d ( o W o r d L i s t . g e t ( j ) . G e t N a t u r a l F o r m ( ) ) ;  
 	 	 	 	 	 }  
 	 	 	 	 }  
 	 	 	 } 	 	 	  
 	 	 	 r e t u r n   l i s t W o r d s ;  
 	 	 }  
 	 	 e l s e  
 	 	 {  
 	 	 	 r e t u r n   n u l l ;  
 	 	 }  
 	 } 	  
 	  
 	 p r i v a t e   S t r i n g [ ]   G e t D i r e c t N o u n F o r m s ( i n t   i T y p e ,   i n t   i S u b T y p e )  
 	 { 	  
 	 	 L i s t < H B T r a n s f o r m R u l e >   l s t R u l e s   =   n e w   A r r a y L i s t < H B T r a n s f o r m R u l e > ( ) ;  
 	 	 o _ R u l e S e t . F i n d R u l e s ( i T y p e ,   i S u b T y p e ,   l s t R u l e s ) ;  
 	 	 i n t   i C o u n t   =   l s t R u l e s . s i z e ( ) ;  
 	 	 i n t   i O u t C o u n t   =   0 ;  
 	 	 i f ( i C o u n t > 0 )  
 	 	 { 	  
 	 	 	 S t r i n g [ ]   a r r W o r d s   =   n e w   S t r i n g [ i C o u n t ] ;  
 	 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 	 {  
 	 	 	 	 H B T r a n s f o r m R u l e   o R u l e   =   l s t R u l e s . g e t ( i ) ; 	 	 	 	  
 	 	 	 	 L i s t < H B W o r d >   o W o r d L i s t   =   o R u l e . G e n e r a t e F o r m ( o _ L e m m a ,   1 ) ; 	 	  
 	 	 	 	 i f ( o W o r d L i s t ! = n u l l   & &   o W o r d L i s t . s i z e ( ) > 0 )  
 	 	 	 	 {  
 	 	 	 	 	 f o r ( i n t   j = 0 ;   j < o W o r d L i s t . s i z e ( ) ;   j + + )  
 	 	 	 	 	 {  
 	 	 	 	 	 	 a r r W o r d s [ i O u t C o u n t + + ]   =   o W o r d L i s t . g e t ( j ) . G e t N a t u r a l F o r m ( ) ;  
 	 	 	 	 	 }  
 	 	 	 	 }  
 	 	 	 }  
 	 	 	  
 	 	 	 r e t u r n   a r r W o r d s ;  
 	 	 }  
 	 	 e l s e  
 	 	 {  
 	 	 	 r e t u r n   n u l l ;  
 	 	 }  
 	 }  
 	  
 	 p u b l i c   S t r i n g [ ]   G e t D e r i v e d N o u n F o r m s ( i n t   i T y p e ,   i n t   i S u b T y p e )  
 	 {  
 	 	 s w i t c h ( i T y p e )  
 	 	 {  
 	 	 	 c a s e     H B I _ C O N J _ K T :  
 	 	 	 {  
 	 	 	 	 / / H B I _ C O N J _ K R   +  ������  
 	 	 	 	 S t r i n g [ ]   a r r W o r d s   =   G e t D i r e c t N o u n F o r m s ( H B I _ C O N J _ K R ,   i S u b T y p e ) ;  
 	 	 	 	 f o r ( i n t   i = 0 ;   i < a r r W o r d s . l e n g t h ;   i + + )  
 	 	 	 	 {  
 	 	 	 	 	 / / a r r W o r d s [ i ] . A p p e n d ( )  
 	 	 	 	 }  
 	 	 	 	  
 	 	 	 	 b r e a k ;  
 	 	 	 }  
 	 	 	 c a s e     H B I _ C O N J _ K A :  
 	 	 	 {  
 	 	 	 	 / / H B I _ C O N J _ K R +������  
 	 	 	 	 b r e a k ;  
 	 	 	 }  
 	 	 	 c a s e     H B I _ C O N J _ S P :  
 	 	 	 {  
 	 	 	 	 / / H B I _ C O N J _ K R +   (��   ,  � )  
 	 	 	 	 b r e a k ;  
 	 	 	 }  
 	 	 	 c a s e     H B I _ C O N J _ A V :  
 	 	 	 {  
 	 	 	 	 / / H B I _ C O N J _ K R +   (������ ,  ���� ,  ������ ) 	 	 	 	  
 	 	 	 	 b r e a k ;  
 	 	 	 }  
 	 	 	 c a s e     H B I _ C O N J _ S M :  
 	 	 	 {  
 	 	 	 	 / / H B I _ C O N J _ K R +  ��  
 	 	 	 	 b r e a k ;  
 	 	 	 }  
 	 	 	 c a s e     H B I _ C O N J _ A D :  
 	 	 	 {  
 	 	 	 	 / / H B I _ C O N J _ K R +  ������  
 	 	 	 	 / / H B I _ C O N J _ K R +  ���  
 	 	 	 	 b r e a k ;  
 	 	 	 } 	 	  
 	 	 	 d e f a u l t :  
 	 	 	 {  
 	 	 	 	  
 	 	 	 }  
 	 	  
 	 	 } 	  
 	 	  
 	 	 r e t u r n   n u l l ;  
 	 }  
 	  
 	 p u b l i c   v o i d   C a l c u l a t e S c o r e ( )  
 	 {  
 	 	 L i s t < H B W o r d >   l i s t F o r m s   =   n e w   A r r a y L i s t < H B W o r d > ( ) ;  
 	 	 G e t A l l N o u n F o r m s ( l i s t F o r m s ,   1 ) ;  
 	 	 H B C o r p u s . G e t W o r d F r e q u e n c i e s ( l i s t F o r m s ) ;  
 	 	 l o n g   l A v a i l a b i l i t y S c o r e   =   0 ;  
 	 	 i n t   i C o u n t   =   l i s t F o r m s . s i z e ( ) ;  
 	 	 l _ S c o r e   =   0 ;  
 	 	 f o r ( i n t   j = 0 ;   j < i C o u n t ;   j + + )  
 	 	 {  
 	 	 	 l o n g   l S c o r e   =   l i s t F o r m s . g e t ( j ) . G e t F r e q u e n c y ( ) ;  
 	 	 	 i f ( l S c o r e   >   0 )  
 	 	 	 {  
 	 	 	 	 l _ S c o r e   + =   l S c o r e ;  
 	 	 	 	 l A v a i l a b i l i t y S c o r e + + ;  
 	 	 	 }  
 	 	 }  
 	 	 l _ S c o r e   + =   ( l A v a i l a b i l i t y S c o r e * l A v a i l a b i l i t y S c o r e * l A v a i l a b i l i t y S c o r e * l A v a i l a b i l i t y S c o r e ) ;  
 	 } 	  
 	  
 	  
 	 p u b l i c   b o o l e a n   F i n d F o r m ( H B W o r d   o W o r d )  
 	 { 	 	  
 	 	 L i s t < H B W o r d >   l i s t F o r m s   =   n e w   A r r a y L i s t < H B W o r d > ( ) ;  
 	 	 G e t A l l N o u n F o r m s ( l i s t F o r m s ,   1 ) ;  
 	 	  
 	 	 i n t   i C o u n t   =   l i s t F o r m s . s i z e ( ) ; 	 	  
  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B W o r d   o W d   =   l i s t F o r m s . g e t ( i ) ;  
 	 	 	 i f ( o W d . E q u a l s ( o W o r d ) )  
 	 	 	 {  
 	 	 	 	 r e t u r n   t r u e ;  
 	 	 	 }  
 	 	 }  
 	 	 r e t u r n   f a l s e ;  
 	 } 	  
 	  
 	 p r i v a t e   v o i d   G e t A l l N o u n F o r m s ( L i s t < H B W o r d >   l i s t F o r m s ,   l o n g   l M i n S c o r e )  
 	 {  
 	 	 L i s t < H B T r a n s f o r m R u l e >   l s t R u l e s   =   n e w   A r r a y L i s t < H B T r a n s f o r m R u l e > ( ) ;  
 	 	 f o r ( i n t   j = 0 ;   j < = H B I _ C O N J _ A L ;   j + + )  
 	 	 {  
 	 	 	 f o r ( i n t   k = 0 ;   k < = H B I _ C A T _ P L U R A L ;   k + + )  
 	 	 	 {  
 	 	 	 	 o _ R u l e S e t . F i n d R u l e s ( j ,   k ,   l s t R u l e s ) ; 	 	 	 	  
 	 	 	 }  
 	 	 }  
 	 	  
 	 	 i n t   i C o u n t   =   l s t R u l e s . s i z e ( ) ; 	 	  
  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B T r a n s f o r m R u l e   o R u l e   =   l s t R u l e s . g e t ( i ) ;  
 	 	 	 L i s t < H B W o r d >   o W o r d L i s t   =   o R u l e . G e n e r a t e F o r m ( o _ L e m m a ,   l M i n S c o r e ) ; 	 	  
 	 	 	 i f ( o W o r d L i s t ! = n u l l   & &   o W o r d L i s t . s i z e ( ) > 0 )  
 	 	 	 {  
 	 	 	 	 f o r ( i n t   j = 0 ;   j < o W o r d L i s t . s i z e ( ) ;   j + + )  
 	 	 	 	 {  
 	 	 	 	 	 l i s t F o r m s . a d d ( o W o r d L i s t . g e t ( j ) ) ;  
 	 	 	 	 }  
 	 	 	 }  
 	 	 } 	 	 	  
 	 } 	  
 	  
 	 p r i v a t e   v o i d   D e b u g P r i n t F o r m ( S t r i n g   s T y p e ,   S t r i n g   s S u b T y p e ,   L i s t < S t r i n g >   l i s t F o r m s )  
 	 {  
 	 	 i f ( l i s t F o r m s ! = n u l l )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t ( s T y p e   +   " ( "   +   s S u b T y p e   +   " ) = " ) ;  
 	 	 	 f o r ( i n t   i = 0 ;   i < l i s t F o r m s . s i z e ( ) ;   i + + )  
 	 	 	 {  
 	 	 	 	 i f ( i = = 0 )  
 	 	 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t ( l i s t F o r m s . g e t ( i ) ) ;  
 	 	 	 	 e l s e  
 	 	 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t ( " ,   "   +   l i s t F o r m s . g e t ( i ) ) ;  
 	 	 	 }  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " < b r > \ r " ) ;  
 	 	 }  
 	 	 e l s e  
 	 	 {  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( s T y p e   +   " ( "   +   s S u b T y p e   +   " ) = N O T _ D E F I N E D < b r > \ r " ) ;  
 	 	 }  
 	 }  
 	  
 	 p u b l i c   v o i d   D e b u g P r i n t ( )  
 	 {  
 	 	  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " N O U N   :   L e m m a = "   +   o _ L e m m a . G e t N a t u r a l F o r m ( )   +   "   :   S c o r e = "   +   l _ S c o r e   +   " < b r > \ r " ) ;  
 	 	  
 	 	 / / T O D O  
 	 	 D e b u g P r i n t F o r m ( " P R " ,   " D S " ,   G e t N o u n F o r m S t r i n g s ( 0 ,   0 ) ) ;  
 	 	 D e b u g P r i n t F o r m ( " P R " ,   " I S " ,   G e t N o u n F o r m S t r i n g s ( 0 ,   1 ) ) ;  
 	 	 D e b u g P r i n t F o r m ( " P R " ,   " P L " ,   G e t N o u n F o r m S t r i n g s ( 0 ,   2 ) ) ;  
 	 	  
 	 	 D e b u g P r i n t F o r m ( " K R " ,   " D S " ,   G e t N o u n F o r m S t r i n g s ( 1 ,   0 ) ) ;  
 	 	 D e b u g P r i n t F o r m ( " K R " ,   " I S " ,   G e t N o u n F o r m S t r i n g s ( 1 ,   1 ) ) ;  
 	 	 D e b u g P r i n t F o r m ( " K R " ,   " P L " ,   G e t N o u n F o r m S t r i n g s ( 1 ,   2 ) ) ;  
  
 	 	 D e b u g P r i n t F o r m ( " A L " ,   " D S " ,   G e t N o u n F o r m S t r i n g s ( 8 ,   0 ) ) ;  
 	 	 D e b u g P r i n t F o r m ( " A L " ,   " I S " ,   G e t N o u n F o r m S t r i n g s ( 8 ,   1 ) ) ;  
 	 	 D e b u g P r i n t F o r m ( " A L " ,   " P L " ,   G e t N o u n F o r m S t r i n g s ( 8 ,   2 ) ) ; 	  
 	 	  
 	 }  
 }  
