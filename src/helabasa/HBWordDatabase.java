 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   *    
   * /  
  
 p a c k a g e   h e l a b a s a ;  
  
 i m p o r t   j a v a . s q l . C o n n e c t i o n ;  
 i m p o r t   j a v a . s q l . R e s u l t S e t ;  
 i m p o r t   j a v a . s q l . S t a t e m e n t ;  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
  
 p u b l i c   c l a s s   H B W o r d D a t a b a s e   e x t e n d s   H B D a t a b a s e   {  
  
 	 p u b l i c   s t a t i c   f i n a l   i n t   S T A T U S _ U N K O W N   	 	 =   0 ;  
 	 p u b l i c   s t a t i c   f i n a l   i n t   S T A T U S _ C O N F I R M E D   	 =   1 ;  
 	 p u b l i c   s t a t i c   f i n a l   i n t   S T A T U S _ O V E R _ W R I T T E N   =   2 ;  
 	  
 	  
 	 p u b l i c   H B W o r d D a t a b a s e ( )   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   c o n s t r u c t o r   s t u b  
 	 }  
 	  
 	 p u b l i c   s t a t i c   l o n g   I n s e r t L e m m a ( H B P O S   o P O S ,   s h o r t   i S t a t e )  
 	 {  
 	 	 i f ( b _ O f f l i n e )  
 	 	 { 	 	 	  
 	 	 	 r e t u r n   0 ;  
 	 	 }  
 	 	  
 	 	 C o n n e c t i o n   o C o n   =   C o n n e c t T o D B ( ) ;  
 	 	 i f ( o C o n ! = n u l l )  
 	 	 {  
 	 	 	 l o n g   l I D   =   I n s e r t L e m m a ( o C o n ,   o P O S ,   i S t a t e ) ;  
 	 	 	 D i s c o n n e c t F r o m D B ( o C o n ) ;  
 	 	 	 r e t u r n   l I D ;  
 	 	 } 	  
 	 	 e l s e    
 	 	 	 r e t u r n   0 ;  
 	 }  
 	  
 	 p u b l i c   s t a t i c   l o n g   G e t L e m m a I D ( H B P O S   o P O S )  
 	 {  
 	 	 l o n g   l L I D   =   0 ;  
 	 	 i f ( b _ O f f l i n e )  
 	 	 { 	 	 	  
 	 	 	 r e t u r n   l L I D ;  
 	 	 }  
 	 	  
 	 	 C o n n e c t i o n   o C o n   =   C o n n e c t T o D B ( ) ;  
 	 	 i f ( o C o n ! = n u l l )  
 	 	 {  
 	 	 	 l L I D =   G e t L e m m a I D ( o C o n ,   o P O S ) ;  
 	 	 	 D i s c o n n e c t F r o m D B ( o C o n ) ;  
 	 	 } 	  
 	 	 r e t u r n   l L I D ;  
 	 }  
 	  
 	 p u b l i c   s t a t i c   b o o l e a n   U p d a t e L e m m a ( H B P O S   o P O S ,   l o n g   l L e m m a I D ,   s h o r t   i S t a t e )  
 	 {  
 	 	 b o o l e a n   b R e t   =   f a l s e ;  
 	 	 i f ( b _ O f f l i n e )  
 	 	 { 	 	 	  
 	 	 	 r e t u r n   b R e t ;  
 	 	 }  
 	 	  
 	 	 C o n n e c t i o n   o C o n   =   C o n n e c t T o D B ( ) ;  
 	 	 i f ( o C o n ! = n u l l )  
 	 	 {  
 	 	 	 b R e t   =   U p d a t e L e m m a ( o C o n ,   o P O S ,   l L e m m a I D ,   i S t a t e ) ;  
 	 	 	 D i s c o n n e c t F r o m D B ( o C o n ) ;  
 	 	 } 	 	  
 	 	 r e t u r n   b R e t ;  
 	 }  
 	  
 	  
 	 p r i v a t e   s t a t i c   l o n g   G e t L e m m a I D ( C o n n e c t i o n   o C o n ,   H B P O S   o P O S )  
 	 {  
 	 	 i f ( b _ O f f l i n e )  
 	 	 { 	 	 	 	  
 	 	 	 r e t u r n   0 ;  
 	 	 }  
 	 	  
 	 	 S t r i n g   s W o r d   =   o P O S . G e t L e m m a ( ) . G e t N a t u r a l F o r m ( ) ;  
 	 	 S t r i n g   s S Q L   =   " s e l e c t   l e m m a _ i d   f r o m   h b _ l e m m a   w h e r e   l e m m a = ' "   +   s W o r d   +   " ' " ; 	 	  
 	 	  
 	 	 R e s u l t S e t   o R S   =   n u l l ;  
 	 	  
 	 	 t r y  
 	 	 {  
 	 	 	 S t a t e m e n t   s Q u e r y   =   o C o n . c r e a t e S t a t e m e n t ( ) ;  
 	 	 	 o R S   =   s Q u e r y . e x e c u t e Q u e r y ( s S Q L ) ;  
 	 	 	 	 	  
 	 	 	 w h i l e ( o R S . n e x t ( ) )  
 	 	 	 { 	 	 	 	  
 	 	 	 	 l o n g   i I D   =   o R S . g e t L o n g ( " l e m m a _ i d " ) ; 	 	 	 	  
 	 	 	 	 r e t u r n   i I D ;  
 	 	 	 } 	 	 	 	 	 	  
 	 	 	 o R S . c l o s e ( ) ;  
 	 	 }  
 	 	 c a t c h ( E x c e p t i o n   e )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " E R R O R   :   G e t   L e m m a   I D   o f   "   +   s W o r d   +   "   f a i l e d   :   "   +   e . g e t M e s s a g e ( ) ) ;  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 }  
 	 	  
 	 	 r e t u r n   0 ;  
 	 }  
 	  
 	 p r i v a t e   s t a t i c   l o n g   I n s e r t L e m m a ( C o n n e c t i o n   o C o n ,   H B P O S   o P O S ,   s h o r t   i S t a t e )  
 	 {  
 	 	 i f ( b _ O f f l i n e )  
 	 	 { 	 	 	 	  
 	 	 	 r e t u r n   0 ;  
 	 	 }  
 	 	  
 	 	 S t r i n g   s W o r d   =   o P O S . G e t L e m m a ( ) . G e t N a t u r a l F o r m ( ) ;  
 	 	 S t r i n g   s S Q L   =   " i n s e r t   i n t o   h b _ l e m m a ( l e m m a ,   l e m m a _ t y p e ,   l e m m a _ s u b _ t y p e ,   l e m m a _ c l a s s ,   l e m m a _ s t a t e )   "   +  
 	 	 	 	 " v a l u e s ( ' " +   s W o r d   +   " ' ,   "   +   o P O S . G e t T y p e ( )   +   " ,   "   +   o P O S . G e t S u b T y p e ( )   +   " ,   "   +   o P O S . G e t H B C l a s s ( )   +   " ,   "   +   i S t a t e   +   " ) " ; 	 	  
  
 	 	 t r y  
 	 	 {  
 	 	 	 S t a t e m e n t   s Q u e r y   =   o C o n . c r e a t e S t a t e m e n t ( ) ;  
 	 	 	 i f ( s Q u e r y . e x e c u t e ( s S Q L ) )  
 	 	 	 {  
 	 	 	 	 r e t u r n     G e t L e m m a I D ( o C o n ,   o P O S ) ;  
 	 	 	 } 	 	  
 	 	 	  
 	 	 }  
 	 	 c a t c h ( E x c e p t i o n   e )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " E R R O R   :   F i n d i n g   F r e q u e n c y   o f   "   +   s W o r d   +   "   f a i l e d   :   "   +   e . g e t M e s s a g e ( ) ) ;  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 }  
 	 	  
 	 	 r e t u r n   0 ;  
 	 }  
 	  
 	 p r i v a t e   s t a t i c   b o o l e a n   U p d a t e L e m m a ( C o n n e c t i o n   o C o n ,   H B P O S   o P O S ,   l o n g   l L e m m a I D ,   s h o r t   i S t a t e )  
 	 {  
 	 	 i f ( b _ O f f l i n e )  
 	 	 { 	 	 	 	  
 	 	 	 r e t u r n   t r u e ;  
 	 	 }  
 	 	  
 	 	 S t r i n g   s W o r d   =   o P O S . G e t L e m m a ( ) . G e t N a t u r a l F o r m ( ) ;  
 	 	 S t r i n g   s S Q L   =   " u p d a t e   h b _ l e m m a   s e t   l e m m a = ' "   +   s W o r d   +   " ' ,   l e m m a _ t y p e = "   +   o P O S . G e t T y p e ( )   +   " ,   l e m m a _ s u b _ t y p e = "   +    
 	 	 	 	 o P O S . G e t S u b T y p e ( )   + 	 " ,   l e m m a _ c l a s s = "   +   o P O S . G e t H B C l a s s ( )   +   " ,   l e m m a _ s t a t e = " +   i S t a t e   +    
 	 	 	 	 "   w h e r e   l e m m a _ i d = "   +   l L e m m a I D ; 	 	  
 	 	 t r y  
 	 	 {  
 	 	 	 S t a t e m e n t   s Q u e r y   =   o C o n . c r e a t e S t a t e m e n t ( ) ;  
 	 	 	 i f ( s Q u e r y . e x e c u t e ( s S Q L ) )  
 	 	 	 {  
 	 	 	 	 r e t u r n   t r u e ;  
 	 	 	 } 	 	 	 	  
 	 	 }  
 	 	 c a t c h ( E x c e p t i o n   e )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " E R R O R   :   U p d a t e   L e m m a   o f   "   +   s W o r d   +   "   f a i l e d   :   "   +   e . g e t M e s s a g e ( ) ) ;  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 }  
 	 	  
 	 	 r e t u r n   f a l s e ;  
 	 }  
 	  
 	 p u b l i c   s t a t i c   b o o l e a n   I n s e r t I r r e g u l a r F o r m s ( l o n g   l L e m m a I D ,   L i s t < H B I r r e g u l a r F o r m >   l s t F o r m )  
 	 {  
 	 	 i f ( b _ O f f l i n e )  
 	 	 { 	 	 	  
 	 	 	 r e t u r n   f a l s e ;  
 	 	 } 	 	  
 	 	 	  
 	 	 C o n n e c t i o n   o C o n   =   C o n n e c t T o D B ( ) ;  
 	 	 i f ( o C o n = = n u l l )  
 	 	 {  
 	 	 	 r e t u r n   f a l s e ;  
 	 	 }  
 	 	 t r y {  
 	 	 	 i n t   i C o u n t   =   l s t F o r m . s i z e ( ) ;  
 	 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 	 {  
 	 	 	 	 H B I r r e g u l a r F o r m   o F o r m   =   l s t F o r m . g e t ( i ) ;  
 	 	 	 	 i f ( ! I n s e r t I r r e g u l a r F o r m ( o C o n ,   l L e m m a I D ,   o F o r m ) )  
 	 	 	 	 {  
 	 	 	 	 	 D i s c o n n e c t F r o m D B ( o C o n ) ;  
 	 	 	 	 	 r e t u r n   f a l s e ;  
 	 	 	 	 }  
 	 	 	 }  
 	 	 	  
 	 	 	 D i s c o n n e c t F r o m D B ( o C o n ) ;  
 	 	 }  
 	 	 c a t c h ( E x c e p t i o n   e )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " E R R O R   :   I n s e r t I r r e g u l a r F o r m s   :   "   +   l L e m m a I D   +   "   f a i l e d   :   "   +   e . g e t M e s s a g e ( ) ) ;  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 } 	  
 	 	 r e t u r n   t r u e ;  
 	 }  
 	  
 	 p r i v a t e   s t a t i c   b o o l e a n   I n s e r t I r r e g u l a r F o r m ( C o n n e c t i o n   o C o n ,   l o n g   l L e m m a I D ,   H B I r r e g u l a r F o r m   o F o r m )  
 	 {  
 	 	 i f ( b _ O f f l i n e )  
 	 	 { 	 	 	  
 	 	 	 r e t u r n   f a l s e ;  
 	 	 } 	 	  
 	  
 	 	 l o n g   l S u f f i x I D   =   R e g i s t e r S u f f i x ( o C o n ,   o F o r m . G e t S u f f i x ( ) ) ;  
 	 	    
 	 	 S t r i n g   s W o r d   =   o F o r m . G e t N a t u r a l F o r m ( ) ;  
 	 	  
 	 	 S t r i n g   s S Q L   =   " i n s e r t   i n t o   h b _ w o r d s ( l e m m a _ i d ,   w o r d ,   w o r d _ c a t e g o r y ,   w o r d _ s u b _ c a t e g o r y ,   s u f f i x _ i d ,   w o r d _ s t a t e )   "   +  
 	 	 	 	 " v a l u e s ( " +   l L e m m a I D   +   " ,   ' "   +   s W o r d   + " ' ,   "   +   o F o r m . G e t T y p e ( )   +   " ,   "   +   o F o r m . G e t S u b T y p e ( )   +   " ,   "   +    
 	 	 	 	 l S u f f i x I D   +   " ,   1 ) " ; 	 	  
  
 	 	 t r y  
 	 	 {  
 	 	 	 S t a t e m e n t   s Q u e r y   =   o C o n . c r e a t e S t a t e m e n t ( ) ;  
 	 	 	 i f ( s Q u e r y . e x e c u t e ( s S Q L ) )  
 	 	 	 {  
 	 	 	 	 r e t u r n   t r u e ;  
 	 	 	 } 	 	  
 	 	 	  
 	 	 }  
 	 	 c a t c h ( E x c e p t i o n   e )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " E R R O R   :   I n s e r t I r r e g u l a r F o r m   :   "   +   s W o r d   +   "   f a i l e d   :   "   +   e . g e t M e s s a g e ( ) ) ;  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 } 	 	 	  
 	 	 r e t u r n   f a l s e ;  
 	 }  
 	  
 	 p u b l i c   s t a t i c   b o o l e a n   C l e a r I r r e g u l a r F o r m s ( l o n g   l L e m m a I D ,   S t r i n g   s S u f f i x )  
 	 {  
 	 	 i f ( b _ O f f l i n e )  
 	 	 { 	 	 	  
 	 	 	 r e t u r n   f a l s e ;  
 	 	 } 	 	  
 	  
 	 	 C o n n e c t i o n   o C o n   =   C o n n e c t T o D B ( ) ;  
 	 	 i f ( o C o n = = n u l l )  
 	 	 {  
 	 	 	 r e t u r n   f a l s e ;  
 	 	 }  
 	 	  
 	 	 S t r i n g   s S Q L   =   " d e l e t e   f r o m   h b _ w o r d s   w h e r e   l e m m a _ i d = " +   l L e m m a I D ; 	 	  
  
 	 	 t r y  
 	 	 {  
 	 	 	 S t a t e m e n t   s Q u e r y   =   o C o n . c r e a t e S t a t e m e n t ( ) ;  
 	 	 	 i f ( s Q u e r y . e x e c u t e ( s S Q L ) )  
 	 	 	 {  
 	 	 	 	 D i s c o n n e c t F r o m D B ( o C o n ) ;  
 	 	 	 	 r e t u r n   t r u e ;  
 	 	 	 	  
 	 	 	 } 	 	  
 	 	 	 D i s c o n n e c t F r o m D B ( o C o n ) ;  
 	 	 }  
 	 	 c a t c h ( E x c e p t i o n   e )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " E R R O R   :   C l e a r I r r e g u l a r F o r m s   :   "   +   l L e m m a I D   +   "   f a i l e d   :   "   +   e . g e t M e s s a g e ( ) ) ;  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 	  
 	 	 } 	 	 	  
 	 	 r e t u r n   f a l s e ;  
 	 } 	  
 	  
 	  
 	 p u b l i c   s t a t i c   L i s t < H B I r r e g u l a r F o r m >   G e t I r r e g u l a r F o r m s ( H B P O S   o L e m m a )  
 	 {  
 	 	 i f ( b _ O f f l i n e )  
 	 	 { 	 	 	  
 	 	 	 r e t u r n   n u l l ;  
 	 	 } 	 	  
 	  
 	 	 C o n n e c t i o n   o C o n   =   C o n n e c t T o D B ( ) ;  
 	 	 i f ( o C o n = = n u l l )  
 	 	 {  
 	 	 	 r e t u r n   n u l l ;  
 	 	 }  
 	 	  
 	 	 l o n g   l L e m m a I D   =   G e t L e m m a I D ( o C o n ,   o L e m m a ) ;  
 	 	 S t r i n g   s S Q L   =   " s e l e c t   w o r d ,   w o r d _ c a t e g o r y ,   w o r d _ s u b _ c a t e g o r y ,   s u f f i x   f r o m   h b _ w o r d s   w ,   h b _ s u f f i x e s   s   "   +  
 	 	 	 	 " w h e r e   s . s u f f i x _ i d = w . s u f f i x _ i d   a n d   l e m m a _ i d = " +   l L e m m a I D ; 	 	  
  
 	 	  
 	 	 / / H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " S Q L   :   "   +   s S Q L ) ;  
 	 	  
 	 	 t r y  
 	 	 {  
 	 	 	 S t a t e m e n t   s Q u e r y   =   o C o n . c r e a t e S t a t e m e n t ( ) ;  
 	 	 	 R e s u l t S e t   o R S   =   s Q u e r y . e x e c u t e Q u e r y ( s S Q L ) ;  
 	 	 	 	 	  
 	 	 	 L i s t < H B I r r e g u l a r F o r m >   l s t O u t   =   n e w   A r r a y L i s t < H B I r r e g u l a r F o r m > ( ) ;  
 	 	 	 w h i l e ( o R S . n e x t ( ) )  
 	 	 	 { 	 	 	 	 	 	 	  
 	 	 	 	 S t r i n g   s W o r d   =   o R S . g e t S t r i n g ( " w o r d " ) ;  
 	 	 	 	 s h o r t   i C a t   =   o R S . g e t S h o r t ( " w o r d _ c a t e g o r y " ) ;  
 	 	 	 	 s h o r t   i S u b C a t   =   o R S . g e t S h o r t ( " w o r d _ s u b _ c a t e g o r y " ) ;  
 	 	 	 	 S t r i n g   s S u f f i x   =   o R S . g e t S t r i n g ( " s u f f i x " ) ;  
 	 	 	 	  
 	 	 	 	 H B I r r e g u l a r F o r m   o F o r m   =   n e w   H B I r r e g u l a r F o r m ( s W o r d ,   s S u f f i x ,   i C a t ,   i S u b C a t ) ;  
 	 	 	 	  
 	 	 	 	 l s t O u t . a d d ( o F o r m ) ;  
 	 	 	 } 	 	 	 	 	 	  
 	 	 	 o R S . c l o s e ( ) ; 	  
 	 	 	 D i s c o n n e c t F r o m D B ( o C o n ) ;  
 	 	 	 r e t u r n   l s t O u t ;  
 	 	 }  
 	 	 c a t c h ( E x c e p t i o n   e )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " E R R O R   :   C l e a r I r r e g u l a r F o r m s   :   "   +   l L e m m a I D   +   "   f a i l e d   :   "   +   e . g e t M e s s a g e ( ) ) ;  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 } 	 	 	  
 	 	 	 	  
 	 	 r e t u r n   n u l l ;  
 	 }  
 	  
 	 p u b l i c   s t a t i c   l o n g   R e g i s t e r S u f f i x ( C o n n e c t i o n   o C o n ,   S t r i n g   s S u f f i x )  
 	 {  
 	 	 i f ( b _ O f f l i n e )  
 	 	 { 	 	 	 	  
 	 	 	 r e t u r n   0 ;  
 	 	 }  
 	 	  
 	 	 s h o r t   i I D   =   G e t S u f f i x I D ( o C o n ,   s S u f f i x ) ;  
 	 	  
 	 	 i f ( i I D = = 0 )  
 	 	 { 	 	 	 	  
 	 	  
 	 	 	 S t r i n g   s S Q L   =   " i n s e r t   i n t o   h b _ s u f f i x e s ( s u f f i x )   v a l u e s ( ' "   +   s S u f f i x   +   " ' ) " ; 	 	  
 	 	 	  
 	 	 	 t r y  
 	 	 	 {  
 	 	 	 	 S t a t e m e n t   s Q u e r y   =   o C o n . c r e a t e S t a t e m e n t ( ) ;  
 	 	 	 	 i f ( s Q u e r y . e x e c u t e ( s S Q L ) )  
 	 	 	 	 {  
 	 	 	 	 	 r e t u r n     G e t S u f f i x I D ( o C o n ,   s S u f f i x ) ;  
 	 	 	 	 } 	 	  
 	 	 	 	  
 	 	 	 }  
 	 	 	 c a t c h ( E x c e p t i o n   e )  
 	 	 	 {  
 	 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " E R R O R   :   R e g i s t e r S u f f i x   :   "   +   s S u f f i x   +   "   f a i l e d   :   "   +   e . g e t M e s s a g e ( ) ) ;  
 	 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 	 }  
 	 	 }  
 	 	 r e t u r n   0 ;  
 	 }  
 	  
 	 p r i v a t e   s t a t i c   s h o r t   G e t S u f f i x I D ( C o n n e c t i o n   o C o n ,   S t r i n g   s S u f f i x )  
 	 {  
 	 	 i f ( b _ O f f l i n e )  
 	 	 { 	 	 	 	  
 	 	 	 r e t u r n   0 ;  
 	 	 }  
 	 	 	 	  
 	 	 S t r i n g   s S Q L   =   " s e l e c t   s u f f i x _ i d   f r o m   h b _ s u f f i x e s   w h e r e   s u f f i x = ' "   +   s S u f f i x   +   " ' " ; 	 	  
 	 	  
 	 	 R e s u l t S e t   o R S   =   n u l l ;  
 	 	  
 	 	 t r y  
 	 	 {  
 	 	 	 S t a t e m e n t   s Q u e r y   =   o C o n . c r e a t e S t a t e m e n t ( ) ;  
 	 	 	 o R S   =   s Q u e r y . e x e c u t e Q u e r y ( s S Q L ) ;  
 	 	 	 	 	  
 	 	 	 w h i l e ( o R S . n e x t ( ) )  
 	 	 	 { 	 	 	 	  
 	 	 	 	 s h o r t   i I D   =   o R S . g e t S h o r t ( " s u f f i x _ i d " ) ; 	 	 	 	  
 	 	 	 	 r e t u r n   i I D ;  
 	 	 	 } 	 	 	 	 	 	  
 	 	 	 o R S . c l o s e ( ) ;  
 	 	 }  
 	 	 c a t c h ( E x c e p t i o n   e )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " E R R O R   :   G e t S u f f i x I D   o f   "   +   s S u f f i x   +   "   f a i l e d   :   "   +   e . g e t M e s s a g e ( ) ) ;  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 }  
 	 	  
 	 	 r e t u r n   0 ;  
 	 } 	  
 }  
