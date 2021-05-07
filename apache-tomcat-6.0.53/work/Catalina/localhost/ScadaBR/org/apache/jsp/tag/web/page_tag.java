package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class page_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
    _jspx_dependants.add("/WEB-INF/tld/mango.tld");
    _jspx_dependants.add("/WEB-INF/tags/menuItem.tag");
    _jspx_dependants.add("/WEB-INF/tags/img.tag");
  }

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsst_005fconvert_0026_005fobj_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public void setJspContext(JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList _jspx_nested = null;
    java.util.ArrayList _jspx_at_begin = null;
    java.util.ArrayList _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public JspContext getJspContext() {
    return this.jspContext;
  }
  private javax.servlet.jsp.tagext.JspFragment styles;
  private java.lang.String dwr;
  private java.lang.String js;
  private java.lang.String onload;

  public javax.servlet.jsp.tagext.JspFragment getStyles() {
    return this.styles;
  }

  public void setStyles(javax.servlet.jsp.tagext.JspFragment styles) {
    this.styles = styles;
    jspContext.setAttribute("styles", styles);
  }

  public java.lang.String getDwr() {
    return this.dwr;
  }

  public void setDwr(java.lang.String dwr) {
    this.dwr = dwr;
    jspContext.setAttribute("dwr", dwr);
  }

  public java.lang.String getJs() {
    return this.js;
  }

  public void setJs(java.lang.String js) {
    this.js = js;
    jspContext.setAttribute("js", js);
  }

  public java.lang.String getOnload() {
    return this.onload;
  }

  public void setOnload(java.lang.String onload) {
    this.onload = onload;
    jspContext.setAttribute("onload", onload);
  }

  public Object getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(ServletConfig config) {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fsst_005fconvert_0026_005fobj_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) config.getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fsst_005fconvert_0026_005fobj_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void doTag() throws JspException, java.io.IOException {
    PageContext _jspx_page_context = (PageContext)jspContext;
    HttpServletRequest request = (HttpServletRequest) _jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse) _jspx_page_context.getResponse();
    HttpSession session = _jspx_page_context.getSession();
    ServletContext application = _jspx_page_context.getServletContext();
    ServletConfig config = _jspx_page_context.getServletConfig();
    JspWriter out = jspContext.getOut();
    _jspInit(config);
    jspContext.getELContext().putContext(JspContext.class,jspContext);
    if( getStyles() != null ) 
      _jspx_page_context.setAttribute("styles", getStyles());
    if( getDwr() != null ) 
      _jspx_page_context.setAttribute("dwr", getDwr());
    if( getJs() != null ) 
      _jspx_page_context.setAttribute("js", getJs());
    if( getOnload() != null ) 
      _jspx_page_context.setAttribute("onload", getOnload());

    try {
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.1//EN\" \"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <title>");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("</title>\r\n");
      out.write("  \r\n");
      out.write("  <!-- Meta -->\r\n");
      out.write("  <meta http-equiv=\"content-type\" content=\"application/xhtml+xml;charset=utf-8\"/>\r\n");
      out.write("  <meta http-equiv=\"Content-Style-Type\" content=\"text/css\" />\r\n");
      out.write("  <meta name=\"Copyright\" content=\"ScadaBR &copy;©2009-2011 Fundação Certi, MCA Sistemas, Unis Sistemas, Conetec, Todos os direitos reservados.\"/>\r\n");
      out.write("  <meta name=\"DESCRIPTION\" content=\"ScadaBR Software\"/>\r\n");
      out.write("  <meta name=\"KEYWORDS\" content=\"ScadaBR Software\"/>\r\n");
      out.write("  \r\n");
      out.write("  <!-- Style -->\r\n");
      out.write("  <link rel=\"icon\" href=\"images/favicon.ico\"/>\r\n");
      out.write("  <link rel=\"shortcut icon\" href=\"images/favicon.ico\"/>\r\n");
      out.write("  <link href=\"resources/common.css\" type=\"text/css\" rel=\"stylesheet\"/>\r\n");
      out.write("  ");
      ((org.apache.jasper.runtime.JspContextWrapper) this.jspContext).syncBeforeInvoke();
      _jspx_sout = null;
      if (getStyles() != null) {
        getStyles().invoke(_jspx_sout);
      }
      jspContext.getELContext().putContext(JspContext.class,getJspContext());
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  <!-- Scripts -->\r\n");
      out.write("  <script type=\"text/javascript\">var djConfig = { isDebug: false, extraLocale: ['en-us', 'nl', 'nl-nl', 'ja-jp', 'fi-fi', 'sv-se', 'zh-cn', 'zh-tw','xx'] };</script>\r\n");
      out.write("  <!-- script type=\"text/javascript\" src=\"http://o.aolcdn.com/dojo/0.4.2/dojo.js\"></script -->\r\n");
      out.write("  <script type=\"text/javascript\" src=\"resources/dojo/dojo.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"dwr/engine.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"dwr/util.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"dwr/interface/MiscDwr.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"resources/soundmanager2-nodebug-jsmin.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"resources/common.js\"></script>\r\n");
      out.write("  ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("  ");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("    mango.i18n = ");
      if (_jspx_meth_sst_005fconvert_005f0(_jspx_page_context))
        return;
      out.write(";\r\n");
      out.write("  </script>\r\n");
      out.write("  ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" id=\"mainHeader\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><img src=\"images/mangoLogoMed.jpg\" alt=\"Logo\"/></td>\r\n");
      out.write("    ");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    ");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fif_005f4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div style=\"padding:5px;\">\r\n");
      out.write("  ");
      ((org.apache.jasper.runtime.JspContextWrapper) this.jspContext).syncBeforeInvoke();
      _jspx_sout = null;
      if (getJspBody() != null)
        getJspBody().invoke(_jspx_sout);
      jspContext.getELContext().putContext(JspContext.class,getJspContext());
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\">\r\n");
      out.write("  <tr><td colspan=\"2\">&nbsp;</td></tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td colspan=\"2\" class=\"footer\" align=\"center\">&copy;2009-2011 Funda&ccedil;&atilde;o Certi, MCA Sistemas, Unis Sistemas, Conetec. ");
      if (_jspx_meth_fmt_005fmessage_005f2(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      if (_jspx_meth_c_005fif_005f10(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch( Throwable t ) {
      if( t instanceof SkipPageException )
          throw (SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof IllegalStateException )
          throw (IllegalStateException) t;
      if( t instanceof JspException )
          throw (JspException) t;
      throw new JspException(t);
    } finally {
      jspContext.getELContext().putContext(JspContext.class,super.getJspContext());
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
      _jspDestroy();
    }
  }

  private boolean _jspx_meth_c_005fchoose_005f0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f0_reused = false;
    try {
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    ");
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("    ");
          if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("  ");
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      _jspx_th_c_005fchoose_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f0, _jsp_annotationprocessor, _jspx_th_c_005fchoose_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f0_reused = false;
    try {
      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/tags/page.tag(29,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty instanceDescription}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${instanceDescription}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      _jspx_th_c_005fwhen_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f0, _jsp_annotationprocessor, _jspx_th_c_005fwhen_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    boolean _jspx_th_c_005fotherwise_005f0_reused = false;
    try {
      _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
      if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          if (_jspx_meth_fmt_005fmessage_005f0(_jspx_th_c_005fotherwise_005f0, _jspx_page_context))
            return true;
          int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      _jspx_th_c_005fotherwise_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fotherwise_005f0, _jsp_annotationprocessor, _jspx_th_c_005fotherwise_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f0_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
      // /WEB-INF/tags/page.tag(30,17) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f0.setKey("header.title");
      int _jspx_eval_fmt_005fmessage_005f0 = _jspx_th_fmt_005fmessage_005f0.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f0);
      _jspx_th_fmt_005fmessage_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f0, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/page.tag(55,2) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dwr}", java.lang.Object.class, (PageContext)this.getJspContext(), null, false));
      // /WEB-INF/tags/page.tag(55,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("dwrname");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("    <script type=\"text/javascript\" src=\"dwr/interface/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dwrname}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
            out.write(".js\"></script>");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new SkipPageException();
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_annotationprocessor, _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f1_reused = false;
    try {
      _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/page.tag(57,2) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${js}", java.lang.Object.class, (PageContext)this.getJspContext(), null, false));
      // /WEB-INF/tags/page.tag(57,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setVar("jsname");
      int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
        if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("    <script type=\"text/javascript\" src=\"resources/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jsname}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
            out.write(".js\"></script>");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new SkipPageException();
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
      _jspx_th_c_005fforEach_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f1, _jsp_annotationprocessor, _jspx_th_c_005fforEach_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sst_005fconvert_005f0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  sst:convert
    com.serotonin.web.taglib.DwrConvertTag _jspx_th_sst_005fconvert_005f0 = (com.serotonin.web.taglib.DwrConvertTag) _005fjspx_005ftagPool_005fsst_005fconvert_0026_005fobj_005fnobody.get(com.serotonin.web.taglib.DwrConvertTag.class);
    boolean _jspx_th_sst_005fconvert_005f0_reused = false;
    try {
      _jspx_th_sst_005fconvert_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sst_005fconvert_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/page.tag(60,17) name = obj type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005fconvert_005f0.setObj((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${clientSideMessages}", java.lang.Object.class, (PageContext)this.getJspContext(), null, false));
      int _jspx_eval_sst_005fconvert_005f0 = _jspx_th_sst_005fconvert_005f0.doStartTag();
      if (_jspx_th_sst_005fconvert_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fsst_005fconvert_0026_005fobj_005fnobody.reuse(_jspx_th_sst_005fconvert_005f0);
      _jspx_th_sst_005fconvert_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sst_005fconvert_005f0, _jsp_annotationprocessor, _jspx_th_sst_005fconvert_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/page.tag(62,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!simple}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    <script type=\"text/javascript\" src=\"resources/header.js\"></script>\r\n");
          out.write("    <script type=\"text/javascript\">\r\n");
          out.write("      dwr.util.setEscapeHtml(false);\r\n");
          out.write("      ");
          if (_jspx_meth_c_005fif_005f1(_jspx_th_c_005fif_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("      \r\n");
          out.write("      function setLocale(locale) {\r\n");
          out.write("          MiscDwr.setLocale(locale, function() { window.location = window.location });\r\n");
          out.write("      }\r\n");
          out.write("      \r\n");
          out.write("      function setHomeUrl() {\r\n");
          out.write("          MiscDwr.setHomeUrl(window.location.href, function() { alert(\"Home URL saved\"); });\r\n");
          out.write("      }\r\n");
          out.write("      \r\n");
          out.write("      function goHomeUrl() {\r\n");
          out.write("          MiscDwr.getHomeUrl(function(loc) { window.location = loc; });\r\n");
          out.write("      }\r\n");
          out.write("    </script>\r\n");
          out.write("  ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_annotationprocessor, _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
      // /WEB-INF/tags/page.tag(66,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty sessionUser}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("        dojo.addOnLoad(mango.header.onLoad);\r\n");
          out.write("        dojo.addOnLoad(function() { setUserMuted(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionUser.muted}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
          out.write("); });\r\n");
          out.write("      ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_annotationprocessor, _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f2_reused = false;
    try {
      _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/page.tag(90,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!simple}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
      int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
      if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("      <td align=\"center\" width=\"99%\" id=\"eventsRow\">\r\n");
          out.write("        <a href=\"events.shtm\">\r\n");
          out.write("          <span id=\"__header__alarmLevelDiv\" style=\"display:none;\">\r\n");
          out.write("            <img id=\"__header__alarmLevelImg\" src=\"images/spacer.gif\" alt=\"\" border=\"0\" title=\"\"/>\r\n");
          out.write("            <span id=\"__header__alarmLevelText\"></span>\r\n");
          out.write("          </span>\r\n");
          out.write("        </a>\r\n");
          out.write("      </td>\r\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      _jspx_th_c_005fif_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f2, _jsp_annotationprocessor, _jspx_th_c_005fif_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f3_reused = false;
    try {
      _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f3.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/page.tag(100,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty instanceDescription}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
      int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
      if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("      <td align=\"right\" valign=\"bottom\" class=\"smallTitle\" style=\"padding:5px; white-space: nowrap;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${instanceDescription}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
          out.write("</td>\r\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
      _jspx_th_c_005fif_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f3, _jsp_annotationprocessor, _jspx_th_c_005fif_005f3_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f4(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f4_reused = false;
    try {
      _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f4.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/page.tag(106,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!simple}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
      int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
      if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("  <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" id=\"subHeader\">\r\n");
          out.write("    <tr>\r\n");
          out.write("      <td style=\"cursor:default\" >\r\n");
          out.write("        ");
          if (_jspx_meth_c_005fif_005f5(_jspx_th_c_005fif_005f4, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("        ");
          if (_jspx_meth_c_005fif_005f8(_jspx_th_c_005fif_005f4, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("        <div id=\"headerMenuDescription\" class=\"labelDiv\" style=\"position:absolute;display:none;\"></div>\r\n");
          out.write("      </td>\r\n");
          out.write("      \r\n");
          out.write("      <td align=\"right\">\r\n");
          out.write("        ");
          if (_jspx_meth_c_005fif_005f9(_jspx_th_c_005fif_005f4, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("        <div style=\"display:inline;\" onmouseover=\"showMenu('localeEdit', -40, 10);\">\r\n");
          out.write("          ");
          if (_jspx_meth_tag_005fimg_005f3(_jspx_th_c_005fif_005f4, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("          <div id=\"localeEdit\" style=\"visibility:hidden;left:0px;top:15px;\" class=\"labelDiv\" onmouseout=\"hideLayer(this)\">\r\n");
          out.write("            ");
          if (_jspx_meth_c_005fforEach_005f2(_jspx_th_c_005fif_005f4, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("          </div>\r\n");
          out.write("        </div>\r\n");
          out.write("      </td>\r\n");
          out.write("    </tr>\r\n");
          out.write("  </table>\r\n");
          int evalDoAfterBody = _jspx_th_c_005fif_005f4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f4);
      _jspx_th_c_005fif_005f4_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f4, _jsp_annotationprocessor, _jspx_th_c_005fif_005f4_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f5_reused = false;
    try {
      _jspx_th_c_005fif_005f5.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
      // /WEB-INF/tags/page.tag(110,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty sessionUser}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
      int _jspx_eval_c_005fif_005f5 = _jspx_th_c_005fif_005f5.doStartTag();
      if (_jspx_eval_c_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("          ");
          if (_jspx_meth_tag_005fmenuItem_005f0(_jspx_th_c_005fif_005f5, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("          ");
          if (_jspx_meth_tag_005fmenuItem_005f1(_jspx_th_c_005fif_005f5, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("          ");
          if (_jspx_meth_tag_005fmenuItem_005f2(_jspx_th_c_005fif_005f5, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("          ");
          if (_jspx_meth_tag_005fmenuItem_005f3(_jspx_th_c_005fif_005f5, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("                \r\n");
          out.write("          ");
          if (_jspx_meth_c_005fif_005f6(_jspx_th_c_005fif_005f5, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("          \r\n");
          out.write("          <img src=\"images/menu_separator.png\"/>\r\n");
          out.write("          ");
          if (_jspx_meth_tag_005fmenuItem_005f10(_jspx_th_c_005fif_005f5, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("          \r\n");
          out.write("          ");
          if (_jspx_meth_c_005fif_005f7(_jspx_th_c_005fif_005f5, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("          \r\n");
          out.write("          <img src=\"images/menu_separator.png\"/>\r\n");
          out.write("          ");
          if (_jspx_meth_tag_005fmenuItem_005f18(_jspx_th_c_005fif_005f5, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("          ");
          if (_jspx_meth_tag_005fmenuItem_005f19(_jspx_th_c_005fif_005f5, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f5);
      _jspx_th_c_005fif_005f5_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f5, _jsp_annotationprocessor, _jspx_th_c_005fif_005f5_reused);
    }
    return false;
  }

  private boolean _jspx_meth_tag_005fmenuItem_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f5, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:menuItem
    org.apache.jsp.tag.web.menuItem_tag _jspx_th_tag_005fmenuItem_005f0 = new org.apache.jsp.tag.web.menuItem_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fmenuItem_005f0);
    _jspx_th_tag_005fmenuItem_005f0.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fmenuItem_005f0.setParent(_jspx_th_c_005fif_005f5);
    // /WEB-INF/tags/page.tag(111,10) name = href type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f0.setHref("watch_list.shtm");
    // /WEB-INF/tags/page.tag(111,10) name = png type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f0.setPng("eye");
    // /WEB-INF/tags/page.tag(111,10) name = key type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f0.setKey("header.watchlist");
    _jspx_th_tag_005fmenuItem_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fmenuItem_005f0);
    return false;
  }

  private boolean _jspx_meth_tag_005fmenuItem_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f5, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:menuItem
    org.apache.jsp.tag.web.menuItem_tag _jspx_th_tag_005fmenuItem_005f1 = new org.apache.jsp.tag.web.menuItem_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fmenuItem_005f1);
    _jspx_th_tag_005fmenuItem_005f1.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fmenuItem_005f1.setParent(_jspx_th_c_005fif_005f5);
    // /WEB-INF/tags/page.tag(112,10) name = href type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f1.setHref("views.shtm");
    // /WEB-INF/tags/page.tag(112,10) name = png type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f1.setPng("icon_view");
    // /WEB-INF/tags/page.tag(112,10) name = key type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f1.setKey("header.views");
    _jspx_th_tag_005fmenuItem_005f1.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fmenuItem_005f1);
    return false;
  }

  private boolean _jspx_meth_tag_005fmenuItem_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f5, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:menuItem
    org.apache.jsp.tag.web.menuItem_tag _jspx_th_tag_005fmenuItem_005f2 = new org.apache.jsp.tag.web.menuItem_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fmenuItem_005f2);
    _jspx_th_tag_005fmenuItem_005f2.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fmenuItem_005f2.setParent(_jspx_th_c_005fif_005f5);
    // /WEB-INF/tags/page.tag(113,10) name = href type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f2.setHref("events.shtm");
    // /WEB-INF/tags/page.tag(113,10) name = png type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f2.setPng("flag_white");
    // /WEB-INF/tags/page.tag(113,10) name = key type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f2.setKey("header.alarms");
    _jspx_th_tag_005fmenuItem_005f2.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fmenuItem_005f2);
    return false;
  }

  private boolean _jspx_meth_tag_005fmenuItem_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f5, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:menuItem
    org.apache.jsp.tag.web.menuItem_tag _jspx_th_tag_005fmenuItem_005f3 = new org.apache.jsp.tag.web.menuItem_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fmenuItem_005f3);
    _jspx_th_tag_005fmenuItem_005f3.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fmenuItem_005f3.setParent(_jspx_th_c_005fif_005f5);
    // /WEB-INF/tags/page.tag(114,10) name = href type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f3.setHref("reports.shtm");
    // /WEB-INF/tags/page.tag(114,10) name = png type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f3.setPng("report");
    // /WEB-INF/tags/page.tag(114,10) name = key type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f3.setKey("header.reports");
    _jspx_th_tag_005fmenuItem_005f3.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fmenuItem_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f5, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f6_reused = false;
    try {
      _jspx_th_c_005fif_005f6.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f5);
      // /WEB-INF/tags/page.tag(116,10) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionUser.dataSourcePermission}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
      int _jspx_eval_c_005fif_005f6 = _jspx_th_c_005fif_005f6.doStartTag();
      if (_jspx_eval_c_005fif_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            <img src=\"images/menu_separator.png\"/>\r\n");
          out.write("            ");
          if (_jspx_meth_tag_005fmenuItem_005f4(_jspx_th_c_005fif_005f6, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("            ");
          if (_jspx_meth_tag_005fmenuItem_005f5(_jspx_th_c_005fif_005f6, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("            ");
          if (_jspx_meth_tag_005fmenuItem_005f6(_jspx_th_c_005fif_005f6, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("            ");
          if (_jspx_meth_tag_005fmenuItem_005f7(_jspx_th_c_005fif_005f6, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("            ");
          if (_jspx_meth_tag_005fmenuItem_005f8(_jspx_th_c_005fif_005f6, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("            ");
          if (_jspx_meth_tag_005fmenuItem_005f9(_jspx_th_c_005fif_005f6, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("          ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f6);
      _jspx_th_c_005fif_005f6_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f6, _jsp_annotationprocessor, _jspx_th_c_005fif_005f6_reused);
    }
    return false;
  }

  private boolean _jspx_meth_tag_005fmenuItem_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f6, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:menuItem
    org.apache.jsp.tag.web.menuItem_tag _jspx_th_tag_005fmenuItem_005f4 = new org.apache.jsp.tag.web.menuItem_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fmenuItem_005f4);
    _jspx_th_tag_005fmenuItem_005f4.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fmenuItem_005f4.setParent(_jspx_th_c_005fif_005f6);
    // /WEB-INF/tags/page.tag(118,12) name = href type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f4.setHref("event_handlers.shtm");
    // /WEB-INF/tags/page.tag(118,12) name = png type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f4.setPng("cog");
    // /WEB-INF/tags/page.tag(118,12) name = key type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f4.setKey("header.eventHandlers");
    _jspx_th_tag_005fmenuItem_005f4.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fmenuItem_005f4);
    return false;
  }

  private boolean _jspx_meth_tag_005fmenuItem_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f6, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:menuItem
    org.apache.jsp.tag.web.menuItem_tag _jspx_th_tag_005fmenuItem_005f5 = new org.apache.jsp.tag.web.menuItem_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fmenuItem_005f5);
    _jspx_th_tag_005fmenuItem_005f5.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fmenuItem_005f5.setParent(_jspx_th_c_005fif_005f6);
    // /WEB-INF/tags/page.tag(119,12) name = href type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f5.setHref("data_sources.shtm");
    // /WEB-INF/tags/page.tag(119,12) name = png type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f5.setPng("icon_ds");
    // /WEB-INF/tags/page.tag(119,12) name = key type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f5.setKey("header.dataSources");
    _jspx_th_tag_005fmenuItem_005f5.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fmenuItem_005f5);
    return false;
  }

  private boolean _jspx_meth_tag_005fmenuItem_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f6, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:menuItem
    org.apache.jsp.tag.web.menuItem_tag _jspx_th_tag_005fmenuItem_005f6 = new org.apache.jsp.tag.web.menuItem_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fmenuItem_005f6);
    _jspx_th_tag_005fmenuItem_005f6.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fmenuItem_005f6.setParent(_jspx_th_c_005fif_005f6);
    // /WEB-INF/tags/page.tag(120,12) name = href type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f6.setHref("scheduled_events.shtm");
    // /WEB-INF/tags/page.tag(120,12) name = png type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f6.setPng("clock");
    // /WEB-INF/tags/page.tag(120,12) name = key type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f6.setKey("header.scheduledEvents");
    _jspx_th_tag_005fmenuItem_005f6.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fmenuItem_005f6);
    return false;
  }

  private boolean _jspx_meth_tag_005fmenuItem_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f6, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:menuItem
    org.apache.jsp.tag.web.menuItem_tag _jspx_th_tag_005fmenuItem_005f7 = new org.apache.jsp.tag.web.menuItem_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fmenuItem_005f7);
    _jspx_th_tag_005fmenuItem_005f7.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fmenuItem_005f7.setParent(_jspx_th_c_005fif_005f6);
    // /WEB-INF/tags/page.tag(121,12) name = href type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f7.setHref("compound_events.shtm");
    // /WEB-INF/tags/page.tag(121,12) name = png type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f7.setPng("multi_bell");
    // /WEB-INF/tags/page.tag(121,12) name = key type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f7.setKey("header.compoundEvents");
    _jspx_th_tag_005fmenuItem_005f7.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fmenuItem_005f7);
    return false;
  }

  private boolean _jspx_meth_tag_005fmenuItem_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f6, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:menuItem
    org.apache.jsp.tag.web.menuItem_tag _jspx_th_tag_005fmenuItem_005f8 = new org.apache.jsp.tag.web.menuItem_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fmenuItem_005f8);
    _jspx_th_tag_005fmenuItem_005f8.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fmenuItem_005f8.setParent(_jspx_th_c_005fif_005f6);
    // /WEB-INF/tags/page.tag(122,12) name = href type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f8.setHref("point_links.shtm");
    // /WEB-INF/tags/page.tag(122,12) name = png type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f8.setPng("link");
    // /WEB-INF/tags/page.tag(122,12) name = key type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f8.setKey("header.pointLinks");
    _jspx_th_tag_005fmenuItem_005f8.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fmenuItem_005f8);
    return false;
  }

  private boolean _jspx_meth_tag_005fmenuItem_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f6, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:menuItem
    org.apache.jsp.tag.web.menuItem_tag _jspx_th_tag_005fmenuItem_005f9 = new org.apache.jsp.tag.web.menuItem_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fmenuItem_005f9);
    _jspx_th_tag_005fmenuItem_005f9.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fmenuItem_005f9.setParent(_jspx_th_c_005fif_005f6);
    // /WEB-INF/tags/page.tag(123,12) name = href type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f9.setHref("scripting.shtm");
    // /WEB-INF/tags/page.tag(123,12) name = png type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f9.setPng("script");
    // /WEB-INF/tags/page.tag(123,12) name = key type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f9.setKey("header.scripts");
    _jspx_th_tag_005fmenuItem_005f9.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fmenuItem_005f9);
    return false;
  }

  private boolean _jspx_meth_tag_005fmenuItem_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f5, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:menuItem
    org.apache.jsp.tag.web.menuItem_tag _jspx_th_tag_005fmenuItem_005f10 = new org.apache.jsp.tag.web.menuItem_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fmenuItem_005f10);
    _jspx_th_tag_005fmenuItem_005f10.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fmenuItem_005f10.setParent(_jspx_th_c_005fif_005f5);
    // /WEB-INF/tags/page.tag(127,10) name = href type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f10.setHref("users.shtm");
    // /WEB-INF/tags/page.tag(127,10) name = png type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f10.setPng("user");
    // /WEB-INF/tags/page.tag(127,10) name = key type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f10.setKey("header.users");
    _jspx_th_tag_005fmenuItem_005f10.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fmenuItem_005f10);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f5, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f7_reused = false;
    try {
      _jspx_th_c_005fif_005f7.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f5);
      // /WEB-INF/tags/page.tag(129,10) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionUser.admin}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
      int _jspx_eval_c_005fif_005f7 = _jspx_th_c_005fif_005f7.doStartTag();
      if (_jspx_eval_c_005fif_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            ");
          if (_jspx_meth_tag_005fmenuItem_005f11(_jspx_th_c_005fif_005f7, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("            ");
          if (_jspx_meth_tag_005fmenuItem_005f12(_jspx_th_c_005fif_005f7, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("            ");
          if (_jspx_meth_tag_005fmenuItem_005f13(_jspx_th_c_005fif_005f7, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("            ");
          if (_jspx_meth_tag_005fmenuItem_005f14(_jspx_th_c_005fif_005f7, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("            ");
          if (_jspx_meth_tag_005fmenuItem_005f15(_jspx_th_c_005fif_005f7, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("            ");
          if (_jspx_meth_tag_005fmenuItem_005f16(_jspx_th_c_005fif_005f7, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("            ");
          if (_jspx_meth_tag_005fmenuItem_005f17(_jspx_th_c_005fif_005f7, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("          ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f7.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f7);
      _jspx_th_c_005fif_005f7_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f7, _jsp_annotationprocessor, _jspx_th_c_005fif_005f7_reused);
    }
    return false;
  }

  private boolean _jspx_meth_tag_005fmenuItem_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f7, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:menuItem
    org.apache.jsp.tag.web.menuItem_tag _jspx_th_tag_005fmenuItem_005f11 = new org.apache.jsp.tag.web.menuItem_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fmenuItem_005f11);
    _jspx_th_tag_005fmenuItem_005f11.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fmenuItem_005f11.setParent(_jspx_th_c_005fif_005f7);
    // /WEB-INF/tags/page.tag(130,12) name = href type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f11.setHref("point_hierarchy.shtm");
    // /WEB-INF/tags/page.tag(130,12) name = png type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f11.setPng("folder_brick");
    // /WEB-INF/tags/page.tag(130,12) name = key type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f11.setKey("header.pointHierarchy");
    _jspx_th_tag_005fmenuItem_005f11.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fmenuItem_005f11);
    return false;
  }

  private boolean _jspx_meth_tag_005fmenuItem_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f7, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:menuItem
    org.apache.jsp.tag.web.menuItem_tag _jspx_th_tag_005fmenuItem_005f12 = new org.apache.jsp.tag.web.menuItem_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fmenuItem_005f12);
    _jspx_th_tag_005fmenuItem_005f12.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fmenuItem_005f12.setParent(_jspx_th_c_005fif_005f7);
    // /WEB-INF/tags/page.tag(131,12) name = href type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f12.setHref("mailing_lists.shtm");
    // /WEB-INF/tags/page.tag(131,12) name = png type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f12.setPng("book");
    // /WEB-INF/tags/page.tag(131,12) name = key type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f12.setKey("header.mailingLists");
    _jspx_th_tag_005fmenuItem_005f12.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fmenuItem_005f12);
    return false;
  }

  private boolean _jspx_meth_tag_005fmenuItem_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f7, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:menuItem
    org.apache.jsp.tag.web.menuItem_tag _jspx_th_tag_005fmenuItem_005f13 = new org.apache.jsp.tag.web.menuItem_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fmenuItem_005f13);
    _jspx_th_tag_005fmenuItem_005f13.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fmenuItem_005f13.setParent(_jspx_th_c_005fif_005f7);
    // /WEB-INF/tags/page.tag(132,12) name = href type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f13.setHref("publishers.shtm");
    // /WEB-INF/tags/page.tag(132,12) name = png type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f13.setPng("transmit");
    // /WEB-INF/tags/page.tag(132,12) name = key type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f13.setKey("header.publishers");
    _jspx_th_tag_005fmenuItem_005f13.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fmenuItem_005f13);
    return false;
  }

  private boolean _jspx_meth_tag_005fmenuItem_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f7, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:menuItem
    org.apache.jsp.tag.web.menuItem_tag _jspx_th_tag_005fmenuItem_005f14 = new org.apache.jsp.tag.web.menuItem_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fmenuItem_005f14);
    _jspx_th_tag_005fmenuItem_005f14.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fmenuItem_005f14.setParent(_jspx_th_c_005fif_005f7);
    // /WEB-INF/tags/page.tag(133,12) name = href type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f14.setHref("maintenance_events.shtm");
    // /WEB-INF/tags/page.tag(133,12) name = png type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f14.setPng("hammer");
    // /WEB-INF/tags/page.tag(133,12) name = key type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f14.setKey("header.maintenanceEvents");
    _jspx_th_tag_005fmenuItem_005f14.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fmenuItem_005f14);
    return false;
  }

  private boolean _jspx_meth_tag_005fmenuItem_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f7, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:menuItem
    org.apache.jsp.tag.web.menuItem_tag _jspx_th_tag_005fmenuItem_005f15 = new org.apache.jsp.tag.web.menuItem_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fmenuItem_005f15);
    _jspx_th_tag_005fmenuItem_005f15.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fmenuItem_005f15.setParent(_jspx_th_c_005fif_005f7);
    // /WEB-INF/tags/page.tag(134,12) name = href type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f15.setHref("system_settings.shtm");
    // /WEB-INF/tags/page.tag(134,12) name = png type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f15.setPng("application_form");
    // /WEB-INF/tags/page.tag(134,12) name = key type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f15.setKey("header.systemSettings");
    _jspx_th_tag_005fmenuItem_005f15.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fmenuItem_005f15);
    return false;
  }

  private boolean _jspx_meth_tag_005fmenuItem_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f7, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:menuItem
    org.apache.jsp.tag.web.menuItem_tag _jspx_th_tag_005fmenuItem_005f16 = new org.apache.jsp.tag.web.menuItem_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fmenuItem_005f16);
    _jspx_th_tag_005fmenuItem_005f16.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fmenuItem_005f16.setParent(_jspx_th_c_005fif_005f7);
    // /WEB-INF/tags/page.tag(135,12) name = href type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f16.setHref("emport.shtm");
    // /WEB-INF/tags/page.tag(135,12) name = png type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f16.setPng("script_code");
    // /WEB-INF/tags/page.tag(135,12) name = key type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f16.setKey("header.emport");
    _jspx_th_tag_005fmenuItem_005f16.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fmenuItem_005f16);
    return false;
  }

  private boolean _jspx_meth_tag_005fmenuItem_005f17(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f7, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:menuItem
    org.apache.jsp.tag.web.menuItem_tag _jspx_th_tag_005fmenuItem_005f17 = new org.apache.jsp.tag.web.menuItem_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fmenuItem_005f17);
    _jspx_th_tag_005fmenuItem_005f17.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fmenuItem_005f17.setParent(_jspx_th_c_005fif_005f7);
    // /WEB-INF/tags/page.tag(136,12) name = href type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f17.setHref("sql.shtm");
    // /WEB-INF/tags/page.tag(136,12) name = png type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f17.setPng("script");
    // /WEB-INF/tags/page.tag(136,12) name = key type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f17.setKey("header.sql");
    _jspx_th_tag_005fmenuItem_005f17.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fmenuItem_005f17);
    return false;
  }

  private boolean _jspx_meth_tag_005fmenuItem_005f18(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f5, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:menuItem
    org.apache.jsp.tag.web.menuItem_tag _jspx_th_tag_005fmenuItem_005f18 = new org.apache.jsp.tag.web.menuItem_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fmenuItem_005f18);
    _jspx_th_tag_005fmenuItem_005f18.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fmenuItem_005f18.setParent(_jspx_th_c_005fif_005f5);
    // /WEB-INF/tags/page.tag(140,10) name = href type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f18.setHref("logout.htm");
    // /WEB-INF/tags/page.tag(140,10) name = png type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f18.setPng("control_stop_blue");
    // /WEB-INF/tags/page.tag(140,10) name = key type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f18.setKey("header.logout");
    _jspx_th_tag_005fmenuItem_005f18.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fmenuItem_005f18);
    return false;
  }

  private boolean _jspx_meth_tag_005fmenuItem_005f19(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f5, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:menuItem
    org.apache.jsp.tag.web.menuItem_tag _jspx_th_tag_005fmenuItem_005f19 = new org.apache.jsp.tag.web.menuItem_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fmenuItem_005f19);
    _jspx_th_tag_005fmenuItem_005f19.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fmenuItem_005f19.setParent(_jspx_th_c_005fif_005f5);
    // /WEB-INF/tags/page.tag(141,10) name = href type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f19.setHref("help.shtm");
    // /WEB-INF/tags/page.tag(141,10) name = png type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f19.setPng("help");
    // /WEB-INF/tags/page.tag(141,10) name = key type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f19.setKey("header.help");
    _jspx_th_tag_005fmenuItem_005f19.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fmenuItem_005f19);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f8_reused = false;
    try {
      _jspx_th_c_005fif_005f8.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
      // /WEB-INF/tags/page.tag(143,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty sessionUser}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
      int _jspx_eval_c_005fif_005f8 = _jspx_th_c_005fif_005f8.doStartTag();
      if (_jspx_eval_c_005fif_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("          ");
          if (_jspx_meth_tag_005fmenuItem_005f20(_jspx_th_c_005fif_005f8, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f8.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f8);
      _jspx_th_c_005fif_005f8_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f8, _jsp_annotationprocessor, _jspx_th_c_005fif_005f8_reused);
    }
    return false;
  }

  private boolean _jspx_meth_tag_005fmenuItem_005f20(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f8, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:menuItem
    org.apache.jsp.tag.web.menuItem_tag _jspx_th_tag_005fmenuItem_005f20 = new org.apache.jsp.tag.web.menuItem_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fmenuItem_005f20);
    _jspx_th_tag_005fmenuItem_005f20.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fmenuItem_005f20.setParent(_jspx_th_c_005fif_005f8);
    // /WEB-INF/tags/page.tag(144,10) name = href type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f20.setHref("login.htm");
    // /WEB-INF/tags/page.tag(144,10) name = png type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f20.setPng("control_play_blue");
    // /WEB-INF/tags/page.tag(144,10) name = key type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmenuItem_005f20.setKey("header.login");
    _jspx_th_tag_005fmenuItem_005f20.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fmenuItem_005f20);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f9_reused = false;
    try {
      _jspx_th_c_005fif_005f9.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
      // /WEB-INF/tags/page.tag(150,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty sessionUser}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
      int _jspx_eval_c_005fif_005f9 = _jspx_th_c_005fif_005f9.doStartTag();
      if (_jspx_eval_c_005fif_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("          <span class=\"copyTitle\">");
          if (_jspx_meth_fmt_005fmessage_005f1(_jspx_th_c_005fif_005f9, _jspx_page_context))
            return true;
          out.write(": <b>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionUser.username}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
          out.write("</b></span>\r\n");
          out.write("          ");
          if (_jspx_meth_tag_005fimg_005f0(_jspx_th_c_005fif_005f9, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("          ");
          if (_jspx_meth_tag_005fimg_005f1(_jspx_th_c_005fif_005f9, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("          ");
          if (_jspx_meth_tag_005fimg_005f2(_jspx_th_c_005fif_005f9, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f9.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f9);
      _jspx_th_c_005fif_005f9_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f9, _jsp_annotationprocessor, _jspx_th_c_005fif_005f9_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f9, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f1_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f1.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f9);
      // /WEB-INF/tags/page.tag(151,34) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f1.setKey("header.user");
      int _jspx_eval_fmt_005fmessage_005f1 = _jspx_th_fmt_005fmessage_005f1.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f1);
      _jspx_th_fmt_005fmessage_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f1, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f9, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f0 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f0);
    _jspx_th_tag_005fimg_005f0.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f0.setParent(_jspx_th_c_005fif_005f9);
    // /WEB-INF/tags/page.tag(152,10) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f0.setId("userMutedImg");
    // /WEB-INF/tags/page.tag(152,10) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f0.setOnclick("MiscDwr.toggleUserMuted(setUserMuted)");
    // /WEB-INF/tags/page.tag(152,10) name = onmouseover type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f0.setOnmouseover("hideLayer('localeEdit')");
    _jspx_th_tag_005fimg_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f0);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f9, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f1 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f1);
    _jspx_th_tag_005fimg_005f1.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f1.setParent(_jspx_th_c_005fif_005f9);
    // /WEB-INF/tags/page.tag(153,10) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f1.setPng("house");
    // /WEB-INF/tags/page.tag(153,10) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f1.setTitle("header.goHomeUrl");
    // /WEB-INF/tags/page.tag(153,10) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f1.setOnclick("goHomeUrl()");
    // /WEB-INF/tags/page.tag(153,10) name = onmouseover type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f1.setOnmouseover("hideLayer('localeEdit')");
    _jspx_th_tag_005fimg_005f1.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f1);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f9, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f2 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f2);
    _jspx_th_tag_005fimg_005f2.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f2.setParent(_jspx_th_c_005fif_005f9);
    // /WEB-INF/tags/page.tag(154,10) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f2.setPng("house_link");
    // /WEB-INF/tags/page.tag(154,10) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f2.setTitle("header.setHomeUrl");
    // /WEB-INF/tags/page.tag(154,10) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f2.setOnclick("setHomeUrl()");
    // /WEB-INF/tags/page.tag(154,10) name = onmouseover type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f2.setOnmouseover("hideLayer('localeEdit')");
    _jspx_th_tag_005fimg_005f2.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f2);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f3 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f3);
    _jspx_th_tag_005fimg_005f3.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f3.setParent(_jspx_th_c_005fif_005f4);
    // /WEB-INF/tags/page.tag(157,10) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f3.setPng("world");
    // /WEB-INF/tags/page.tag(157,10) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f3.setTitle("header.changeLanguage");
    _jspx_th_tag_005fimg_005f3.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f2_reused = false;
    try {
      _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
      // /WEB-INF/tags/page.tag(159,12) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${availableLanguages}", java.lang.Object.class, (PageContext)this.getJspContext(), null, false));
      // /WEB-INF/tags/page.tag(159,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f2.setVar("lang");
      int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
        if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("              <a class=\"ptr\" onclick=\"setLocale('");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lang.key}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
            out.write("')\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lang.value}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
            out.write("</a><br/>\r\n");
            out.write("            ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f2.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new SkipPageException();
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f2[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f2.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f2.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f2);
      _jspx_th_c_005fforEach_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f2, _jsp_annotationprocessor, _jspx_th_c_005fforEach_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f2(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f2 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f2_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f2.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/page.tag(175,134) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f2.setKey("footer.rightsReserved");
      int _jspx_eval_fmt_005fmessage_005f2 = _jspx_th_fmt_005fmessage_005f2.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f2);
      _jspx_th_fmt_005fmessage_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f2, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f10(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f10_reused = false;
    try {
      _jspx_th_c_005fif_005f10.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f10.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/page.tag(178,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty onload}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
      int _jspx_eval_c_005fif_005f10 = _jspx_th_c_005fif_005f10.doStartTag();
      if (_jspx_eval_c_005fif_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("  <script type=\"text/javascript\">dojo.addOnLoad(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${onload}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
          out.write(");</script>\r\n");
          int evalDoAfterBody = _jspx_th_c_005fif_005f10.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f10);
      _jspx_th_c_005fif_005f10_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f10, _jsp_annotationprocessor, _jspx_th_c_005fif_005f10_reused);
    }
    return false;
  }
}
