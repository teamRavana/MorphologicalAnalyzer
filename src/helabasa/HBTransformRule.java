 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   * /  
 p a c k a g e   h e l a b a s a ;  
  
 i m p o r t   h e l a b a s a . n o u n s . H B N o u n ;  
 i m p o r t   h e l a b a s a . s a n d h i . H B W o r d J o i n e r ;  
  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
  
 p u b l i c   c l a s s   H B T r a n s f o r m R u l e   {  
 	  
 	 p u b l i c   s t a t i c   f i n a l   i n t   H B T R _ A P P E N D   = 	 5 5 ;  
 	 p u b l i c   s t a t i c   f i n a l   i n t   H B T R _ J O I N   	 = 	 0 ;  
  
 	  
 	 p r i v a t e   H B W o r d 	 o _ S u f f i x   =   n u l l ;  
 	 / / p r i v a t e   H B W o r d 	 o _ R e m o v e   =   n u l l ;  
 	 p r i v a t e   i n t 	 	 i _ T y p e   =   0 ;  
 	 p r i v a t e   i n t 	 	 i _ S u b T y p e   =   0 ;  
 	 p r i v a t e   H B T r a n s f o r m R u l e S e t 	 o _ R u l e S e t   =   n u l l ;  
 	 p r i v a t e   i n t 	 	 i _ J o i n M e t h o d   =   0 ;  
 	  
 	 p u b l i c   H B T r a n s f o r m R u l e ( )    
 	 { 	 	  
 	 	 o _ S u f f i x   =   n e w   H B W o r d ( ) ;  
 	 }  
  
 	 p u b l i c   H B T r a n s f o r m R u l e ( i n t   i T y p e ,   i n t   i S u b T y p e ,   i n t   i J o i n M e t h o d ,   H B W o r d   o S u f f i x )    
 	 { 	  
 	 	 o _ S u f f i x   =   o S u f f i x ;  
 	 	 i _ T y p e   =   i T y p e ;  
 	 	 i _ S u b T y p e   =   i S u b T y p e ;  
 	 	 i _ J o i n M e t h o d   =   i J o i n M e t h o d ;  
 	 }  
 	  
 	 p u b l i c   H B T r a n s f o r m R u l e ( i n t   i T y p e ,   i n t   i S u b T y p e ,   i n t   i J o i n M e t h o d ,   S t r i n g   s S u f f i x )    
 	 { 	  
 	 	 o _ S u f f i x   =   n e w   H B W o r d ( s S u f f i x ) ;  
 	 	 i _ T y p e   =   i T y p e ;  
 	 	 i _ S u b T y p e   =   i S u b T y p e ;  
 	 	 i _ J o i n M e t h o d   =   i J o i n M e t h o d ;  
 	 } 	  
  
 	 p u b l i c   i n t   G e t T y p e ( )  
 	 {  
 	 	 r e t u r n   i _ T y p e ;  
 	 }  
 	  
 	 p u b l i c   i n t   G e t S u b T y p e ( )  
 	 {  
 	 	 r e t u r n   i _ S u b T y p e ;  
 	 }  
 	  
 	 p u b l i c   i n t   G e t J o i n M e t h o d ( )  
 	 {  
 	 	 r e t u r n   i _ J o i n M e t h o d ;  
 	 }  
 	  
 	 p u b l i c   H B W o r d   G e t S u f f i x ( )  
 	 {  
 	 	 r e t u r n   o _ S u f f i x ;  
 	 }  
 	  
 	 / / R e t u r n s   a   s c o r e   r e p r e s e n t   t h e   m a t c h i n g   w i t h   f o r m  
 	 / /   L + S   - >   S  
 	 / /   L S   - >   S  
 	 p u b l i c   l o n g   M a t c h F o r m ( H B W o r d   o W o r d )  
 	 {  
 	 	 i f ( i _ J o i n M e t h o d = = H B T R _ A P P E N D )  
 	 	 {  
 	 	 	 / / H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " - - - - - - - - - - - - - - - - - - - - - - - - - -   M a t c h i n g   F o r m s   ( M a t c h )   - - - - - - - - - - - - - - - - - - - - - - - - - - - -   < b r > \ r " ) ;  
 	 	 	 / / D e b u g P r i n t ( ) ;  
 	 	 	  
 	 	 	 r e t u r n   o _ S u f f i x . M a t c h ( o W o r d ) ;  
 	 	 }  
 	 	 e l s e  
 	 	 {  
 	 	 	 / / H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " - - - - - - - - - - - - - - - - - - - - - - - - - -   M a t c h i n g   F o r m s   ( D i s j o i n )   - - - - - - - - - - - - - - - - - - - - - - - - - - - -   < b r > \ r " ) ;  
 	 	 	 / / D e b u g P r i n t ( ) ;  
 	 	 	  
 	 	 	 r e t u r n   H B W o r d J o i n e r . C h e c k D i s j o i n a b l e ( o W o r d ,   o _ S u f f i x ,   f a l s e ,   1 ,   i _ T y p e ) ; 	 	 	  
 	 	 }  
 	 }  
 	  
 	  
 	 / / R e t u r n s   a   s c o r e   r e p r e s e n t   t h e   m a t c h i n g   w i t h   f o r m  
 	 / /   L + S   - >   S  
 	 / /   L S   - >   S  
 	 p u b l i c   v o i d   M a t c h F o r m ( H B W o r d   o W o r d ,   L i s t < H B W o r d >   l i s t L e m m a s )  
 	 {  
 	 	 i f ( i _ J o i n M e t h o d = = H B T R _ A P P E N D )  
 	 	 {  
 	 	 	 / / H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " - - - - - - - - - - - - - - - - - - - - - - - - - -   M a t c h i n g   F o r m s   ( M a t c h )   - - - - - - - - - - - - - - - - - - - - - - - - - - - -   < b r > \ r " ) ;  
 	 	 	 / / D e b u g P r i n t ( ) ;  
 	 	 	  
 	 	 	 i f ( o _ S u f f i x . M a t c h ( o W o r d ) > 0 )  
 	 	 	 {  
 	 	 	 	 l i s t L e m m a s . a d d (   o _ S u f f i x . E x t r a c t V a r i a b l e P a r t ( o W o r d )   ) ;  
 	 	 	 }  
 	 	 }  
 	 	 e l s e  
 	 	 {  
 	 	 	 / / H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " - - - - - - - - - - - - - - - - - - - - - - - - - -   M a t c h i n g   F o r m s   ( D i s j o i n )   - - - - - - - - - - - - - - - - - - - - - - - - - - - -   < b r > \ r " ) ;  
 	 	 	 / / D e b u g P r i n t ( ) ;  
 	 	 	  
 	 	 	 H B W o r d J o i n e r . D i s j o i n ( o W o r d ,   o _ S u f f i x ,   f a l s e ,   0 ,   l i s t L e m m a s ,   i _ T y p e ) ; 	 	 	  
 	 	 }  
 	 }  
  
  
 	 / / R e t u r n s   a   n o r m a l i z e d   L e m m a   f o r m   o f   t h e   g i v e n   w o r d   a c c o r d i n g   t o   t h i s   r u l e  
 	 / /   L + S   - >   L  
 	 / /   L S   - >   L 	  
 	 p u b l i c   L i s t < H B W o r d >   E x t r a c t L e m m a ( H B W o r d   o W o r d )  
 	 {  
 	 	 L i s t < H B W o r d >   o W o r d L i s t   =   n u l l ;  
 	 	 i f ( i _ J o i n M e t h o d = = H B T R _ A P P E N D )  
 	 	 {  
 	 	 	 o W o r d L i s t   =   n e w   A r r a y L i s t < H B W o r d > ( ) ;  
 	 	 	 o W o r d L i s t . a d d ( o _ S u f f i x . E x t r a c t V a r i a b l e P a r t ( o W o r d ) ) ;  
 	 	 }  
 	 	 e l s e  
 	 	 { 	 	 	 	  
 	 	 	 o W o r d L i s t   =   H B W o r d J o i n e r . D i s j o i n ( o W o r d ,   o _ S u f f i x ,   t r u e ,   1 ,   i _ T y p e ) ;  
 	 	 }  
 	 	 r e t u r n   o W o r d L i s t ;  
 	 }  
 	  
 	 / /   L ,   S   - >   L + S  
 	 / /   L ,   S   - >   L S  
 	 p u b l i c   L i s t < H B W o r d >   G e n e r a t e F o r m ( H B W o r d   o L e m m a ,   l o n g   l M i n S c o r e )  
 	 {  
 	 	  
 	 	 L i s t < H B W o r d >   o W o r d L i s t   =   n u l l ;  
 	 	 i f ( i _ J o i n M e t h o d = = H B T R _ A P P E N D )  
 	 	 {  
 	 	 	 o W o r d L i s t   =   n e w   A r r a y L i s t < H B W o r d > ( ) ;  
 	 	 	  
 	 	 	 i f ( o _ S u f f i x . G e t B a s e C h a r a c t e r C o u n t ( ) = = 0 )  
 	 	 	 {  
 	 	 	 	 o W o r d L i s t . a d d ( o L e m m a . C l o n e ( ) ) ;  
 	 	 	 }  
 	 	 	 e l s e  
 	 	 	 	 o W o r d L i s t . a d d ( o _ S u f f i x . A p p l y P a t t e r n ( o L e m m a ) ) ;  
 	 	 }  
 	 	 e l s e  
 	 	 { 	 	 	  
 	 	 	 o W o r d L i s t   =   H B W o r d J o i n e r . J o i n ( o L e m m a ,   o _ S u f f i x ,   t r u e ,   l M i n S c o r e ,   o _ R u l e S e t . G e t T y p e ( ) ) ;  
 	 	 	 / / H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " G e n e r a t e F o r m   :   "   +     o L e m m a . G e t N a t u r a l F o r m ( )   +   "   +   "   +      
 	 	 	 / / 	 	 o _ S u f f i x . G e t N a t u r a l F o r m ( )   +   "   :   "   +   o W o r d L i s t . s i z e ( )   +   "   P o s s i b i l i t i e s " +   " < b r > \ n \ r " ) ;  
 	 	 }  
 	 	  
 	 	 r e t u r n   o W o r d L i s t ;  
 	 }  
 	  
 	 p u b l i c   v o i d   D e b u g P r i n t ( )  
 	 {  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " R u l e   :   "   +     H B N o u n . a r r _ V i b h a k t h i [ i _ T y p e ] +   " [ "   +   i _ T y p e   +   " ]   :   "   +     H B N o u n . a r r _ N o u n C a t e g o r i e s [ i _ S u b T y p e ]   +   "   =   L M   +   "   +   o _ S u f f i x . G e t N a t u r a l F o r m ( )   +   " < b r > \ n \ r " ) ;  
 	 }  
 	  
 	  
 	 p u b l i c   v o i d   S e t R u l e S e t ( H B T r a n s f o r m R u l e S e t   o R u l e S e t )  
 	 {  
 	 	 o _ R u l e S e t   =   o R u l e S e t ;  
 	 }  
 	  
 	 p u b l i c   H B T r a n s f o r m R u l e S e t   G e t R u l e S e t ( )  
 	 {  
 	 	 r e t u r n   o _ R u l e S e t ;  
 	 }  
 }  
