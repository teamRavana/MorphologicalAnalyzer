 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   * /  
 p a c k a g e   h e l a b a s a ;  
  
 i m p o r t   j a v a . s q l . C o n n e c t i o n ;  
 i m p o r t   j a v a . s q l . R e s u l t S e t ;  
 i m p o r t   j a v a . s q l . S t a t e m e n t ;  
 i m p o r t   j a v a . u t i l . H a s h M a p ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
 i m p o r t   j a v a . u t i l . M a p ;  
  
 p u b l i c   c l a s s   H B C o r p u s   e x t e n d s   H B D a t a b a s e {  
  
 	 p u b l i c   H B C o r p u s ( )   {  
  
 	 }  
  
 	 p u b l i c   s t a t i c   b o o l e a n   I n i t ( )  
 	 {  
 	 	 r e t u r n   t r u e ;  
 	 }  
 	  
 	 p u b l i c   s t a t i c   l o n g   G e t W o r d F r e q u e n c y ( H B W o r d   o W o r d )  
 	 {  
 	 	 i f ( b _ O f f l i n e )  
 	 	 {  
 	 	 	 r e t u r n   1 ;  
 	 	 }  
 	 	  
 	 	 C o n n e c t i o n   o C o n   =   C o n n e c t T o D B ( ) ;  
 	 	 i f ( o C o n ! = n u l l )  
 	 	 { 	 	 	  
 	 	 	 l o n g   l F r e q   =   G e t W o r d F r e q u e n c y ( o C o n ,   o W o r d ) ;  
 	 	 	 D i s c o n n e c t F r o m D B ( o C o n ) ;  
 	 	 	 r e t u r n   l F r e q ;  
 	 	 }  
 	 	 e l s e  
 	 	 	 r e t u r n   0 ;  
 	 }  
  
 	 p u b l i c   s t a t i c   v o i d   G e t W o r d F r e q u e n c i e s ( L i s t < H B W o r d >   l i s t W o r d s )  
 	 {  
 	 	 i f ( b _ O f f l i n e )  
 	 	 {  
 	 	 	 G e t W o r d F r e q u e n c y ( n u l l ,   l i s t W o r d s ) ;  
 	 	 	 r e t u r n ;  
 	 	 }  
 	 	  
 	 	 C o n n e c t i o n   o C o n   =   C o n n e c t T o D B ( ) ;  
 	 	 i f ( o C o n ! = n u l l )  
 	 	 {  
 	 	 	 G e t W o r d F r e q u e n c y ( o C o n ,   l i s t W o r d s ) ;  
 	 	 	 D i s c o n n e c t F r o m D B ( o C o n ) ;  
 	 	 } 	  
 	 }  
 	 	  
 	 p u b l i c   s t a t i c   l o n g   G e t W o r d F r e q u e n c y ( C o n n e c t i o n   o C o n ,   H B W o r d   o W o r d )  
 	 {  
 	 	 i f ( b _ O f f l i n e )  
 	 	 { 	 	  
 	 	 	 o W o r d . S e t F r e q u e n c y ( 1 ) ;  
 	 	 	 r e t u r n   1 ;  
 	 	 }  
 	 	  
 	 	 S t r i n g   s W o r d   =   o W o r d . G e t N a t u r a l F o r m ( ) ;  
 	 	 S t r i n g   s S Q L   =   " s e l e c t   f r e q u e n c y   f r o m   h b c _ w o r d s   w h e r e   w o r d = ' "   +   s W o r d   +   " ' " ; 	 	  
 	 	 R e s u l t S e t   o R S   =   n u l l ;  
 	 	  
 	 	 t r y  
 	 	 {  
 	 	 	 S t a t e m e n t   s Q u e r y   =   o C o n . c r e a t e S t a t e m e n t ( ) ;  
 	 	 	 o R S   =   s Q u e r y . e x e c u t e Q u e r y ( s S Q L ) ;  
 	 	 	 	 	  
 	 	 	 w h i l e ( o R S . n e x t ( ) )  
 	 	 	 { 	 	 	 	  
 	 	 	 	 l o n g   l F r e q   =   o R S . g e t L o n g ( " f r e q u e n c y " ) ; 	 	 	 	  
 	 	 	 	 o W o r d . S e t F r e q u e n c y ( l F r e q ) ;  
 	 	 	 	 r e t u r n   l F r e q ;  
 	 	 	 } 	 	 	 	 	 	  
 	 	 	 o R S . c l o s e ( ) ;  
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
 	 p u b l i c   s t a t i c   v o i d   G e t W o r d F r e q u e n c y ( C o n n e c t i o n   o C o n ,   L i s t < H B W o r d >   l i s t W o r d s )  
 	 {  
 	 	 i f ( b _ O f f l i n e )  
 	 	 { 	 	 	 	  
 	 	 	 f o r ( i n t   i = 0 ;   i < l i s t W o r d s . s i z e ( ) ;   i + + )  
 	 	 	 {  
 	 	 	 	 l i s t W o r d s . g e t ( i ) . S e t F r e q u e n c y ( 1 ) ; 	 	 	 	  
 	 	 	 } 	 	 	  
 	 	 	 r e t u r n ;  
 	 	 }  
 	 	  
 	 	  
 	 	 M a p < S t r i n g ,   H B W o r d >   m a p W o r d s   =   n e w   H a s h M a p < S t r i n g ,   H B W o r d > ( ) ;  
 	 	  
 	 	 i n t   i C o u n t   =   l i s t W o r d s . s i z e ( ) ;  
 	 	 i f ( i C o u n t = = 0 )  
 	 	 {  
 	 	 	 r e t u r n ; 	 	  
 	 	 }  
 	 	  
 	 	 S t r i n g B u i l d e r   s b W o r d s   =   n e w   S t r i n g B u i l d e r ( ) ;  
 	 	  
 	 	 s b W o r d s . a p p e n d ( " ( " ) ;  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 i f ( i > 0 )  
 	 	 	 {  
 	 	 	 	 s b W o r d s . a p p e n d ( " , " ) ;  
 	 	 	 }  
 	 	 	  
 	 	 	 H B W o r d   o W o r d   =   l i s t W o r d s . g e t ( i ) ;  
 	 	 	 S t r i n g   s W o r d   =   o W o r d . G e t N a t u r a l F o r m ( ) ;  
 	 	 	 m a p W o r d s . p u t ( s W o r d ,   o W o r d ) ;  
 	 	 	  
 	 	 	 s b W o r d s . a p p e n d ( ' \ ' ' ) ;  
 	 	 	 s b W o r d s . a p p e n d ( s W o r d ) ;  
 	 	 	 s b W o r d s . a p p e n d ( ' \ ' ' ) ; 	 	 	  
 	 	 }  
 	 	 s b W o r d s . a p p e n d ( " ) " ) ;  
 	 	 	 	  
 	 	 S t r i n g   s S Q L   =   " s e l e c t   w o r d ,   f r e q u e n c y   f r o m   h b c _ w o r d s   w h e r e   w o r d   i n   "   +   s b W o r d s . t o S t r i n g ( ) ; 	 	  
 	 	 R e s u l t S e t   o R S   =   n u l l ;  
 	 	  
 	 	 t r y  
 	 	 {  
 	 	 	 S t a t e m e n t   s Q u e r y   =   o C o n . c r e a t e S t a t e m e n t ( ) ;  
 	 	 	 o R S   =   s Q u e r y . e x e c u t e Q u e r y ( s S Q L ) ;  
 	 	 	 	 	  
 	 	 	 w h i l e ( o R S . n e x t ( ) )  
 	 	 	 { 	 	 	 	  
 	 	 	 	 l o n g   l F r e q   =   o R S . g e t L o n g ( " f r e q u e n c y " ) ; 	 	 	 	  
 	 	 	 	 S t r i n g   s W   =   o R S . g e t S t r i n g ( " w o r d " ) ;  
 	 	 	 	 H B W o r d   o W   =   m a p W o r d s . g e t ( s W ) ;  
 	 	 	 	 o W . S e t F r e q u e n c y ( l F r e q ) ; 	 	  
 	 	 	 } 	 	 	 	 	 	  
 	 	 	 o R S . c l o s e ( ) ;  
 	 	 }  
 	 	 c a t c h ( E x c e p t i o n   e )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " E R R O R   :   F i n d i n g   F r e q u e n c y   f a i l e d   :   "   +   e . g e t M e s s a g e ( ) ) ;  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 } 	 	 	  
 	 } 	  
 }  
