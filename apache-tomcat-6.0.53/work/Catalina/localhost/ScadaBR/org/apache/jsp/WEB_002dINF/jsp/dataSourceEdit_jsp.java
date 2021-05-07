package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.serotonin.mango.Common;

public final class dataSourceEdit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(6);
    _jspx_dependants.add("/WEB-INF/jsp/include/tech.jsp");
    _jspx_dependants.add("/WEB-INF/tld/mango.tld");
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
    _jspx_dependants.add("/WEB-INF/tags/page.tag");
    _jspx_dependants.add("/WEB-INF/tags/menuItem.tag");
    _jspx_dependants.add("/WEB-INF/tags/img.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      //  tag:page
      org.apache.jsp.tag.web.page_tag _jspx_th_tag_005fpage_005f0 = new org.apache.jsp.tag.web.page_tag();
      org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fpage_005f0);
      _jspx_th_tag_005fpage_005f0.setJspContext(_jspx_page_context);
      // /WEB-INF/jsp/dataSourceEdit.jsp(22,0) name = dwr type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_tag_005fpage_005f0.setDwr("DataSourceEditDwr");
      // /WEB-INF/jsp/dataSourceEdit.jsp(22,0) name = onload type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_tag_005fpage_005f0.setOnload("init");
      _jspx_th_tag_005fpage_005f0.setJspBody(new Helper( 0, _jspx_page_context, _jspx_th_tag_005fpage_005f0, null));
      _jspx_th_tag_005fpage_005f0.doTag();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fpage_005f0);
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_fmt_005fmessage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f0_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/dataSourceEdit.jsp(31,37) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f0.setKey("dsEdit.name");
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

  private boolean _jspx_meth_fmt_005fmessage_005f1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f1_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f1.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/dataSourceEdit.jsp(34,37) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f1.setKey("dsEdit.pointDataType");
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

  private boolean _jspx_meth_fmt_005fmessage_005f2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f2 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f2_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f2.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/dataSourceEdit.jsp(37,37) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f2.setKey("dsEdit.status");
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

  private boolean _jspx_meth_fmt_005fmessage_005f3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f3 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f3_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f3.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f3.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/dataSourceEdit.jsp(42,61) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f3.setKey("common.enabledToggle");
      int _jspx_eval_fmt_005fmessage_005f3 = _jspx_th_fmt_005fmessage_005f3.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f3);
      _jspx_th_fmt_005fmessage_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f3, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f3_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f4 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f4_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f4.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f4.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/dataSourceEdit.jsp(43,59) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f4.setKey("common.disabledToggle");
      int _jspx_eval_fmt_005fmessage_005f4 = _jspx_th_fmt_005fmessage_005f4.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f4);
      _jspx_th_fmt_005fmessage_005f4_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f4, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f4_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f5 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f5_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f5.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f5.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/dataSourceEdit.jsp(51,76) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f5.setKey("common.edit");
      int _jspx_eval_fmt_005fmessage_005f5 = _jspx_th_fmt_005fmessage_005f5.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f5);
      _jspx_th_fmt_005fmessage_005f5_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f5, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f5_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/dataSourceEdit.jsp(95,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty param.pid}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("          // Default the selection if the parameter was provided.\r\n");
          out.write("          editPoint(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.pid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(");\r\n");
          out.write("        ");
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

  private boolean _jspx_meth_fmt_005fmessage_005f6(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f6 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f6_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f6.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f6.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/dataSourceEdit.jsp(112,46) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f6.setKey("dsEdit.saved");
      int _jspx_eval_fmt_005fmessage_005f6 = _jspx_th_fmt_005fmessage_005f6.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f6);
      _jspx_th_fmt_005fmessage_005f6_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f6, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f6_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f7(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f7 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f7_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f7.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f7.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/dataSourceEdit.jsp(146,21) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f7.setKey("dsEdit.deleteConfirm");
      int _jspx_eval_fmt_005fmessage_005f7 = _jspx_th_fmt_005fmessage_005f7.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f7);
      _jspx_th_fmt_005fmessage_005f7_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f7, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f7_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f8(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f8 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f8_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f8.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f8.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/dataSourceEdit.jsp(176,19) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f8.setKey("dsEdit.saveWarning");
      int _jspx_eval_fmt_005fmessage_005f8 = _jspx_th_fmt_005fmessage_005f8.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f8);
      _jspx_th_fmt_005fmessage_005f8_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f8, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f8_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f9(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f9 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f9_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f9.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f9.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/dataSourceEdit.jsp(238,41) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f9.setKey("dsEdit.pointSaved");
      int _jspx_eval_fmt_005fmessage_005f9 = _jspx_th_fmt_005fmessage_005f9.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f9);
      _jspx_th_fmt_005fmessage_005f9_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f9, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f9_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f10(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f10 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f10_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f10.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f10.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/dataSourceEdit.jsp(301,29) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f10.setKey("dsEdit.currentAlarms");
      int _jspx_eval_fmt_005fmessage_005f10 = _jspx_th_fmt_005fmessage_005f10.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f10);
      _jspx_th_fmt_005fmessage_005f10_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f10, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f10_reused);
    }
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f0 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f0);
    _jspx_th_tag_005fimg_005f0.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f0.setParent(_jspx_parent);
    // /WEB-INF/jsp/dataSourceEdit.jsp(304,24) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f0.setPng("control_repeat_blue");
    // /WEB-INF/jsp/dataSourceEdit.jsp(304,24) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f0.setTitle("common.refresh");
    // /WEB-INF/jsp/dataSourceEdit.jsp(304,24) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f0.setOnclick("getAlarms()");
    _jspx_th_tag_005fimg_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f0);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f11(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f11 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f11_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f11.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f11.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/dataSourceEdit.jsp(311,13) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f11.setKey("dsEdit.noAlarms");
      int _jspx_eval_fmt_005fmessage_005f11 = _jspx_th_fmt_005fmessage_005f11.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f11);
      _jspx_th_fmt_005fmessage_005f11_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f11, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f11_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f0_reused = false;
    try {
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_c_005fwhen_005f1(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_c_005fwhen_005f2(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_c_005fwhen_005f3(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_c_005fwhen_005f4(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_c_005fwhen_005f5(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_c_005fwhen_005f6(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_c_005fwhen_005f7(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_c_005fwhen_005f8(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_c_005fwhen_005f9(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_c_005fwhen_005f10(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_c_005fwhen_005f11(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_c_005fwhen_005f12(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_c_005fwhen_005f13(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_c_005fwhen_005f14(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_c_005fwhen_005f15(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_c_005fwhen_005f16(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_c_005fwhen_005f17(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_c_005fwhen_005f18(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_c_005fwhen_005f19(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("                ");
          if (_jspx_meth_c_005fwhen_005f20(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_c_005fwhen_005f21(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_c_005fwhen_005f22(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_c_005fwhen_005f23(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_c_005fwhen_005f24(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_c_005fwhen_005f25(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_c_005fwhen_005f26(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_c_005fwhen_005f27(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_c_005fwhen_005f28(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_c_005fwhen_005f29(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_c_005fwhen_005f30(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_c_005fwhen_005f31(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_c_005fwhen_005f32(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_c_005fwhen_005f33(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_c_005fwhen_005f34(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write('\r');
          out.write('\n');
          out.write('	');
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
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f0_reused = false;
    try {
      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/jsp/dataSourceEdit.jsp(321,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dataSource.type.id == applicationScope['constants.DataSourceVO.Types.VIRTUAL']}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dataSourceEdit/editVirtual.jsp", out, false);
          out.write("\r\n");
          out.write("\t\t");
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

  private boolean _jspx_meth_c_005fwhen_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f1_reused = false;
    try {
      _jspx_th_c_005fwhen_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/jsp/dataSourceEdit.jsp(325,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dataSource.type.id == applicationScope['constants.DataSourceVO.Types.MODBUS_SERIAL']}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
      if (_jspx_eval_c_005fwhen_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dataSourceEdit/editModbus.jsp", out, false);
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
      _jspx_th_c_005fwhen_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f1, _jsp_annotationprocessor, _jspx_th_c_005fwhen_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f2_reused = false;
    try {
      _jspx_th_c_005fwhen_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/jsp/dataSourceEdit.jsp(329,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dataSource.type.id == applicationScope['constants.DataSourceVO.Types.MODBUS_IP']}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fwhen_005f2 = _jspx_th_c_005fwhen_005f2.doStartTag();
      if (_jspx_eval_c_005fwhen_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dataSourceEdit/editModbus.jsp", out, false);
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f2);
      _jspx_th_c_005fwhen_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f2, _jsp_annotationprocessor, _jspx_th_c_005fwhen_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f3 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f3_reused = false;
    try {
      _jspx_th_c_005fwhen_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/jsp/dataSourceEdit.jsp(333,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dataSource.type.id == applicationScope['constants.DataSourceVO.Types.SPINWAVE']}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fwhen_005f3 = _jspx_th_c_005fwhen_005f3.doStartTag();
      if (_jspx_eval_c_005fwhen_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dataSourceEdit/editSpinwave.jsp", out, false);
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f3);
      _jspx_th_c_005fwhen_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f3, _jsp_annotationprocessor, _jspx_th_c_005fwhen_005f3_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f4 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f4_reused = false;
    try {
      _jspx_th_c_005fwhen_005f4.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/jsp/dataSourceEdit.jsp(337,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dataSource.type.id == applicationScope['constants.DataSourceVO.Types.SNMP']}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fwhen_005f4 = _jspx_th_c_005fwhen_005f4.doStartTag();
      if (_jspx_eval_c_005fwhen_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dataSourceEdit/editSnmp.jsp", out, false);
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f4);
      _jspx_th_c_005fwhen_005f4_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f4, _jsp_annotationprocessor, _jspx_th_c_005fwhen_005f4_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f5 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f5_reused = false;
    try {
      _jspx_th_c_005fwhen_005f5.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/jsp/dataSourceEdit.jsp(341,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dataSource.type.id == applicationScope['constants.DataSourceVO.Types.SQL']}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fwhen_005f5 = _jspx_th_c_005fwhen_005f5.doStartTag();
      if (_jspx_eval_c_005fwhen_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dataSourceEdit/editSql.jsp", out, false);
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f5);
      _jspx_th_c_005fwhen_005f5_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f5, _jsp_annotationprocessor, _jspx_th_c_005fwhen_005f5_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f6 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f6_reused = false;
    try {
      _jspx_th_c_005fwhen_005f6.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/jsp/dataSourceEdit.jsp(345,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dataSource.type.id == applicationScope['constants.DataSourceVO.Types.HTTP_RECEIVER']}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fwhen_005f6 = _jspx_th_c_005fwhen_005f6.doStartTag();
      if (_jspx_eval_c_005fwhen_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dataSourceEdit/editHttpReceiver.jsp", out, false);
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f6);
      _jspx_th_c_005fwhen_005f6_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f6, _jsp_annotationprocessor, _jspx_th_c_005fwhen_005f6_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f7 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f7_reused = false;
    try {
      _jspx_th_c_005fwhen_005f7.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/jsp/dataSourceEdit.jsp(349,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dataSource.type.id == applicationScope['constants.DataSourceVO.Types.ONE_WIRE']}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fwhen_005f7 = _jspx_th_c_005fwhen_005f7.doStartTag();
      if (_jspx_eval_c_005fwhen_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dataSourceEdit/editOneWire.jsp", out, false);
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f7.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f7);
      _jspx_th_c_005fwhen_005f7_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f7, _jsp_annotationprocessor, _jspx_th_c_005fwhen_005f7_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f8 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f8_reused = false;
    try {
      _jspx_th_c_005fwhen_005f8.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/jsp/dataSourceEdit.jsp(353,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dataSource.type.id == applicationScope['constants.DataSourceVO.Types.META']}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fwhen_005f8 = _jspx_th_c_005fwhen_005f8.doStartTag();
      if (_jspx_eval_c_005fwhen_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dataSourceEdit/editMeta.jsp", out, false);
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f8.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f8);
      _jspx_th_c_005fwhen_005f8_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f8, _jsp_annotationprocessor, _jspx_th_c_005fwhen_005f8_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f9 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f9_reused = false;
    try {
      _jspx_th_c_005fwhen_005f9.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/jsp/dataSourceEdit.jsp(357,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dataSource.type.id == applicationScope['constants.DataSourceVO.Types.BACNET']}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fwhen_005f9 = _jspx_th_c_005fwhen_005f9.doStartTag();
      if (_jspx_eval_c_005fwhen_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dataSourceEdit/editBacnetIp.jsp", out, false);
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f9.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f9);
      _jspx_th_c_005fwhen_005f9_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f9, _jsp_annotationprocessor, _jspx_th_c_005fwhen_005f9_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f10 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f10_reused = false;
    try {
      _jspx_th_c_005fwhen_005f10.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/jsp/dataSourceEdit.jsp(361,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dataSource.type.id == applicationScope['constants.DataSourceVO.Types.HTTP_RETRIEVER']}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fwhen_005f10 = _jspx_th_c_005fwhen_005f10.doStartTag();
      if (_jspx_eval_c_005fwhen_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dataSourceEdit/editHttpRetriever.jsp", out, false);
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f10.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f10);
      _jspx_th_c_005fwhen_005f10_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f10, _jsp_annotationprocessor, _jspx_th_c_005fwhen_005f10_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f11 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f11_reused = false;
    try {
      _jspx_th_c_005fwhen_005f11.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/jsp/dataSourceEdit.jsp(365,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dataSource.type.id == applicationScope['constants.DataSourceVO.Types.POP3']}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fwhen_005f11 = _jspx_th_c_005fwhen_005f11.doStartTag();
      if (_jspx_eval_c_005fwhen_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dataSourceEdit/editPop3.jsp", out, false);
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f11.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f11);
      _jspx_th_c_005fwhen_005f11_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f11, _jsp_annotationprocessor, _jspx_th_c_005fwhen_005f11_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f12 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f12_reused = false;
    try {
      _jspx_th_c_005fwhen_005f12.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/jsp/dataSourceEdit.jsp(369,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f12.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dataSource.type.id == applicationScope['constants.DataSourceVO.Types.NMEA']}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fwhen_005f12 = _jspx_th_c_005fwhen_005f12.doStartTag();
      if (_jspx_eval_c_005fwhen_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dataSourceEdit/editNmea.jsp", out, false);
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f12.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f12);
      _jspx_th_c_005fwhen_005f12_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f12, _jsp_annotationprocessor, _jspx_th_c_005fwhen_005f12_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f13 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f13_reused = false;
    try {
      _jspx_th_c_005fwhen_005f13.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/jsp/dataSourceEdit.jsp(373,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f13.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dataSource.type.id == applicationScope['constants.DataSourceVO.Types.GALIL']}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fwhen_005f13 = _jspx_th_c_005fwhen_005f13.doStartTag();
      if (_jspx_eval_c_005fwhen_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dataSourceEdit/editGalil.jsp", out, false);
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f13.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f13);
      _jspx_th_c_005fwhen_005f13_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f13, _jsp_annotationprocessor, _jspx_th_c_005fwhen_005f13_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f14 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f14_reused = false;
    try {
      _jspx_th_c_005fwhen_005f14.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/jsp/dataSourceEdit.jsp(377,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f14.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dataSource.type.id == applicationScope['constants.DataSourceVO.Types.HTTP_IMAGE']}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fwhen_005f14 = _jspx_th_c_005fwhen_005f14.doStartTag();
      if (_jspx_eval_c_005fwhen_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dataSourceEdit/editHttpImage.jsp", out, false);
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f14.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f14);
      _jspx_th_c_005fwhen_005f14_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f14, _jsp_annotationprocessor, _jspx_th_c_005fwhen_005f14_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f15 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f15_reused = false;
    try {
      _jspx_th_c_005fwhen_005f15.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/jsp/dataSourceEdit.jsp(381,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f15.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dataSource.type.id == applicationScope['constants.DataSourceVO.Types.EBI25']}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fwhen_005f15 = _jspx_th_c_005fwhen_005f15.doStartTag();
      if (_jspx_eval_c_005fwhen_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dataSourceEdit/editEBI25.jsp", out, false);
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f15.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f15);
      _jspx_th_c_005fwhen_005f15_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f15, _jsp_annotationprocessor, _jspx_th_c_005fwhen_005f15_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f16 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f16_reused = false;
    try {
      _jspx_th_c_005fwhen_005f16.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/jsp/dataSourceEdit.jsp(385,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f16.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dataSource.type.id == applicationScope['constants.DataSourceVO.Types.VMSTAT']}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fwhen_005f16 = _jspx_th_c_005fwhen_005f16.doStartTag();
      if (_jspx_eval_c_005fwhen_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dataSourceEdit/editVMStat.jsp", out, false);
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f16.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f16);
      _jspx_th_c_005fwhen_005f16_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f16, _jsp_annotationprocessor, _jspx_th_c_005fwhen_005f16_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f17(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f17 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f17_reused = false;
    try {
      _jspx_th_c_005fwhen_005f17.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/jsp/dataSourceEdit.jsp(389,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f17.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dataSource.type.id == applicationScope['constants.DataSourceVO.Types.VICONICS']}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fwhen_005f17 = _jspx_th_c_005fwhen_005f17.doStartTag();
      if (_jspx_eval_c_005fwhen_005f17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dataSourceEdit/editViconics.jsp", out, false);
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f17.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f17);
      _jspx_th_c_005fwhen_005f17_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f17, _jsp_annotationprocessor, _jspx_th_c_005fwhen_005f17_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f18(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f18 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f18_reused = false;
    try {
      _jspx_th_c_005fwhen_005f18.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/jsp/dataSourceEdit.jsp(393,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f18.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dataSource.type.id == applicationScope['constants.DataSourceVO.Types.M_BUS']}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fwhen_005f18 = _jspx_th_c_005fwhen_005f18.doStartTag();
      if (_jspx_eval_c_005fwhen_005f18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dataSourceEdit/editMBus.jsp", out, false);
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f18.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f18);
      _jspx_th_c_005fwhen_005f18_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f18, _jsp_annotationprocessor, _jspx_th_c_005fwhen_005f18_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f19(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f19 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f19_reused = false;
    try {
      _jspx_th_c_005fwhen_005f19.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/jsp/dataSourceEdit.jsp(397,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f19.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dataSource.type.id == applicationScope['constants.DataSourceVO.Types.OPEN_V_4_J']}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fwhen_005f19 = _jspx_th_c_005fwhen_005f19.doStartTag();
      if (_jspx_eval_c_005fwhen_005f19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dataSourceEdit/editOpenV4J.jsp", out, false);
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f19.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f19);
      _jspx_th_c_005fwhen_005f19_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f19, _jsp_annotationprocessor, _jspx_th_c_005fwhen_005f19_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f20(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f20 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f20_reused = false;
    try {
      _jspx_th_c_005fwhen_005f20.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/jsp/dataSourceEdit.jsp(401,16) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f20.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dataSource.type.id == applicationScope['constants.DataSourceVO.Types.FHZ_4_J']}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fwhen_005f20 = _jspx_th_c_005fwhen_005f20.doStartTag();
      if (_jspx_eval_c_005fwhen_005f20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        ");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dataSourceEdit/editFhz4J.jsp", out, false);
          out.write("\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f20.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f20);
      _jspx_th_c_005fwhen_005f20_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f20, _jsp_annotationprocessor, _jspx_th_c_005fwhen_005f20_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f21(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f21 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f21_reused = false;
    try {
      _jspx_th_c_005fwhen_005f21.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/jsp/dataSourceEdit.jsp(404,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f21.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dataSource.type.id == applicationScope['constants.DataSourceVO.Types.DNP3_IP']}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fwhen_005f21 = _jspx_th_c_005fwhen_005f21.doStartTag();
      if (_jspx_eval_c_005fwhen_005f21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dataSourceEdit/editDnp3.jsp", out, false);
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f21.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f21);
      _jspx_th_c_005fwhen_005f21_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f21, _jsp_annotationprocessor, _jspx_th_c_005fwhen_005f21_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f22(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f22 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f22_reused = false;
    try {
      _jspx_th_c_005fwhen_005f22.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/jsp/dataSourceEdit.jsp(408,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f22.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dataSource.type.id == applicationScope['constants.DataSourceVO.Types.DNP3_SERIAL']}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fwhen_005f22 = _jspx_th_c_005fwhen_005f22.doStartTag();
      if (_jspx_eval_c_005fwhen_005f22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dataSourceEdit/editDnp3.jsp", out, false);
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f22.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f22);
      _jspx_th_c_005fwhen_005f22_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f22, _jsp_annotationprocessor, _jspx_th_c_005fwhen_005f22_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f23(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f23 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f23_reused = false;
    try {
      _jspx_th_c_005fwhen_005f23.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/jsp/dataSourceEdit.jsp(412,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f23.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dataSource.type.id == applicationScope['constants.DataSourceVO.Types.PACHUBE']}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fwhen_005f23 = _jspx_th_c_005fwhen_005f23.doStartTag();
      if (_jspx_eval_c_005fwhen_005f23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dataSourceEdit/editPachube.jsp", out, false);
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f23.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f23);
      _jspx_th_c_005fwhen_005f23_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f23, _jsp_annotationprocessor, _jspx_th_c_005fwhen_005f23_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f24(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f24 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f24_reused = false;
    try {
      _jspx_th_c_005fwhen_005f24.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/jsp/dataSourceEdit.jsp(416,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f24.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dataSource.type.id == applicationScope['constants.DataSourceVO.Types.PERSISTENT']}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fwhen_005f24 = _jspx_th_c_005fwhen_005f24.doStartTag();
      if (_jspx_eval_c_005fwhen_005f24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dataSourceEdit/editPersistent.jsp", out, false);
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f24.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f24);
      _jspx_th_c_005fwhen_005f24_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f24, _jsp_annotationprocessor, _jspx_th_c_005fwhen_005f24_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f25(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f25 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f25_reused = false;
    try {
      _jspx_th_c_005fwhen_005f25.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/jsp/dataSourceEdit.jsp(420,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f25.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dataSource.type.id == applicationScope['constants.DataSourceVO.Types.OPC']}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fwhen_005f25 = _jspx_th_c_005fwhen_005f25.doStartTag();
      if (_jspx_eval_c_005fwhen_005f25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dataSourceEdit/editOpc.jsp", out, false);
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f25.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f25);
      _jspx_th_c_005fwhen_005f25_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f25, _jsp_annotationprocessor, _jspx_th_c_005fwhen_005f25_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f26(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f26 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f26_reused = false;
    try {
      _jspx_th_c_005fwhen_005f26.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/jsp/dataSourceEdit.jsp(424,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f26.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dataSource.type.id == applicationScope['constants.DataSourceVO.Types.ASCII_FILE']}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fwhen_005f26 = _jspx_th_c_005fwhen_005f26.doStartTag();
      if (_jspx_eval_c_005fwhen_005f26 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dataSourceEdit/editAsciiFile.jsp", out, false);
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f26.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f26);
      _jspx_th_c_005fwhen_005f26_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f26, _jsp_annotationprocessor, _jspx_th_c_005fwhen_005f26_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f27(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f27 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f27_reused = false;
    try {
      _jspx_th_c_005fwhen_005f27.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/jsp/dataSourceEdit.jsp(428,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f27.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dataSource.type.id == applicationScope['constants.DataSourceVO.Types.ASCII_SERIAL']}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fwhen_005f27 = _jspx_th_c_005fwhen_005f27.doStartTag();
      if (_jspx_eval_c_005fwhen_005f27 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dataSourceEdit/editAsciiSerial.jsp", out, false);
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f27.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f27);
      _jspx_th_c_005fwhen_005f27_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f27, _jsp_annotationprocessor, _jspx_th_c_005fwhen_005f27_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f28(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f28 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f28_reused = false;
    try {
      _jspx_th_c_005fwhen_005f28.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/jsp/dataSourceEdit.jsp(432,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f28.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dataSource.type.id == applicationScope['constants.DataSourceVO.Types.IEC101_SERIAL']}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fwhen_005f28 = _jspx_th_c_005fwhen_005f28.doStartTag();
      if (_jspx_eval_c_005fwhen_005f28 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dataSourceEdit/editIEC101.jsp", out, false);
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f28.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f28);
      _jspx_th_c_005fwhen_005f28_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f28, _jsp_annotationprocessor, _jspx_th_c_005fwhen_005f28_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f29(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f29 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f29_reused = false;
    try {
      _jspx_th_c_005fwhen_005f29.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/jsp/dataSourceEdit.jsp(436,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f29.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dataSource.type.id == applicationScope['constants.DataSourceVO.Types.IEC101_ETHERNET']}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fwhen_005f29 = _jspx_th_c_005fwhen_005f29.doStartTag();
      if (_jspx_eval_c_005fwhen_005f29 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dataSourceEdit/editIEC101.jsp", out, false);
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f29.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f29);
      _jspx_th_c_005fwhen_005f29_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f29, _jsp_annotationprocessor, _jspx_th_c_005fwhen_005f29_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f30(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f30 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f30_reused = false;
    try {
      _jspx_th_c_005fwhen_005f30.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/jsp/dataSourceEdit.jsp(440,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f30.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dataSource.type.id == applicationScope['constants.DataSourceVO.Types.NODAVE_S7']}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fwhen_005f30 = _jspx_th_c_005fwhen_005f30.doStartTag();
      if (_jspx_eval_c_005fwhen_005f30 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dataSourceEdit/editNodaveS7.jsp", out, false);
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f30.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f30);
      _jspx_th_c_005fwhen_005f30_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f30, _jsp_annotationprocessor, _jspx_th_c_005fwhen_005f30_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f31(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f31 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f31_reused = false;
    try {
      _jspx_th_c_005fwhen_005f31.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/jsp/dataSourceEdit.jsp(444,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f31.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dataSource.type.id == applicationScope['constants.DataSourceVO.Types.DR_STORAGE_HT5B']}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fwhen_005f31 = _jspx_th_c_005fwhen_005f31.doStartTag();
      if (_jspx_eval_c_005fwhen_005f31 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dataSourceEdit/editDrStorageHt5b.jsp", out, false);
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f31.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f31);
      _jspx_th_c_005fwhen_005f31_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f31, _jsp_annotationprocessor, _jspx_th_c_005fwhen_005f31_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f32(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f32 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f32_reused = false;
    try {
      _jspx_th_c_005fwhen_005f32.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/jsp/dataSourceEdit.jsp(448,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f32.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dataSource.type.id == applicationScope['constants.DataSourceVO.Types.ALPHA_2']}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fwhen_005f32 = _jspx_th_c_005fwhen_005f32.doStartTag();
      if (_jspx_eval_c_005fwhen_005f32 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dataSourceEdit/editAlpha2.jsp", out, false);
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f32.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f32);
      _jspx_th_c_005fwhen_005f32_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f32, _jsp_annotationprocessor, _jspx_th_c_005fwhen_005f32_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f33(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f33 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f33_reused = false;
    try {
      _jspx_th_c_005fwhen_005f33.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/jsp/dataSourceEdit.jsp(452,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f33.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dataSource.type.id == applicationScope['constants.DataSourceVO.Types.INTERNAL']}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fwhen_005f33 = _jspx_th_c_005fwhen_005f33.doStartTag();
      if (_jspx_eval_c_005fwhen_005f33 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dataSourceEdit/editInternal.jsp", out, false);
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f33.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f33);
      _jspx_th_c_005fwhen_005f33_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f33, _jsp_annotationprocessor, _jspx_th_c_005fwhen_005f33_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f34(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f34 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f34_reused = false;
    try {
      _jspx_th_c_005fwhen_005f34.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/jsp/dataSourceEdit.jsp(456,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f34.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dataSource.type.id == applicationScope['constants.DataSourceVO.Types.JMX']}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fwhen_005f34 = _jspx_th_c_005fwhen_005f34.doStartTag();
      if (_jspx_eval_c_005fwhen_005f34 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dataSourceEdit/editJmx.jsp", out, false);
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f34.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f34);
      _jspx_th_c_005fwhen_005f34_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f34, _jsp_annotationprocessor, _jspx_th_c_005fwhen_005f34_reused);
    }
    return false;
  }

  private class Helper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public Helper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public void invoke0( JspWriter out ) 
      throws Throwable
    {
      HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
      HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("    var currentPoint;\r\n");
      out.write("    var pointListColumnFunctions = new Array();\r\n");
      out.write("    var pointListOptions;\r\n");
      out.write("    \r\n");
      out.write("    function init() {\r\n");
      out.write("        var pointListColumnHeaders = new Array();\r\n");
      out.write("        \r\n");
      out.write("        pointListColumnHeaders.push(\"");
      if (_jspx_meth_fmt_005fmessage_005f0(_jspx_parent, _jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("        pointListColumnFunctions.push(function(p) { return \"<b>\"+ p.name +\"</b>\"; });\r\n");
      out.write("        \r\n");
      out.write("        pointListColumnHeaders.push(\"");
      if (_jspx_meth_fmt_005fmessage_005f1(_jspx_parent, _jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("        pointListColumnFunctions.push(function(p) { return p.dataTypeMessage; });\r\n");
      out.write("        \r\n");
      out.write("        pointListColumnHeaders.push(\"");
      if (_jspx_meth_fmt_005fmessage_005f2(_jspx_parent, _jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("        pointListColumnFunctions.push(function(p) {\r\n");
      out.write("                var id = \"toggleImg\"+ p.id;\r\n");
      out.write("                var onclick = \"togglePoint(\"+ p.id +\")\";\r\n");
      out.write("                if (p.enabled)\r\n");
      out.write("                    return writeImage(id, null, \"brick_go\", \"");
      if (_jspx_meth_fmt_005fmessage_005f3(_jspx_parent, _jspx_page_context))
        return;
      out.write("\", onclick);\r\n");
      out.write("                return writeImage(id, null, \"brick_stop\", \"");
      if (_jspx_meth_fmt_005fmessage_005f4(_jspx_parent, _jspx_page_context))
        return;
      out.write("\", onclick);\r\n");
      out.write("        });\r\n");
      out.write("        \r\n");
      out.write("        if (typeof appendPointListColumnFunctions == 'function')\r\n");
      out.write("            appendPointListColumnFunctions(pointListColumnHeaders, pointListColumnFunctions);\r\n");
      out.write("        \r\n");
      out.write("        pointListColumnHeaders.push(\"\");\r\n");
      out.write("        pointListColumnFunctions.push(function(p) {\r\n");
      out.write("                return writeImage(\"editImg\"+ p.id, null, \"icon_comp_edit\", \"");
      if (_jspx_meth_fmt_005fmessage_005f5(_jspx_parent, _jspx_page_context))
        return;
      out.write("\", \"editPoint(\"+ p.id +\")\");\r\n");
      out.write("        });\r\n");
      out.write("        \r\n");
      out.write("        var headers = $(\"pointListHeaders\");\r\n");
      out.write("        var td;\r\n");
      out.write("        for (var i=0; i<pointListColumnHeaders.length; i++) {\r\n");
      out.write("            td = document.createElement(\"td\");\r\n");
      out.write("            if (typeof(pointListColumnHeaders[i]) == \"string\")\r\n");
      out.write("                td.innerHTML = pointListColumnHeaders[i];\r\n");
      out.write("            else\r\n");
      out.write("                pointListColumnHeaders[i](td);\r\n");
      out.write("            headers.appendChild(td);\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        pointListOptions = {\r\n");
      out.write("                rowCreator: function(options) {\r\n");
      out.write("                    var tr = document.createElement(\"tr\");\r\n");
      out.write("                    tr.mangoId = \"p\"+ options.rowData.id;\r\n");
      out.write("                    tr.className = \"row\"+ (options.rowIndex % 2 == 0 ? \"\" : \"Alt\");\r\n");
      out.write("                    return tr;\r\n");
      out.write("                },\r\n");
      out.write("                cellCreator: function(options) {\r\n");
      out.write("                    var td = document.createElement(\"td\");\r\n");
      out.write("                    if (options.cellNum == 2)\r\n");
      out.write("                        td.align = \"center\";\r\n");
      out.write("                    return td;\r\n");
      out.write("                }\r\n");
      out.write("        };\r\n");
      out.write("        \r\n");
      out.write("        var dsStatus = $(\"dsStatusImg\");\r\n");
      out.write("        setDataSourceStatusImg(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dataSource.enabled}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(", dsStatus);\r\n");
      out.write("        hide(dsStatus);\r\n");
      out.write("        \r\n");
      out.write("        if (typeof initImpl == 'function') initImpl();\r\n");
      out.write("        \r\n");
      out.write("        DataSourceEditDwr.editInit(initCB);\r\n");
      out.write("        showMessage(\"dataSourceMessage\");\r\n");
      out.write("        showMessage(\"pointMessage\");\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function initCB(response) {\r\n");
      out.write("        writePointList(response.data.points);\r\n");
      out.write("        writeAlarms(response.data.alarms);\r\n");
      out.write("        \r\n");
      out.write("        ");
      if (_jspx_meth_c_005fif_005f0(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function saveDataSource() {\r\n");
      out.write("        startImageFader(\"dsSaveImg\", true);\r\n");
      out.write("        hideContextualMessages($(\"dataSourceProperties\"));\r\n");
      out.write("        saveDataSourceImpl();\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function saveDataSourceCB(response) {\r\n");
      out.write("        stopImageFader(\"dsSaveImg\");\r\n");
      out.write("        if (response.hasMessages)\r\n");
      out.write("            showDwrMessages(response.messages, \"dataSourceGenericMessages\");\r\n");
      out.write("        else {\r\n");
      out.write("            showMessage(\"dataSourceMessage\", \"");
      if (_jspx_meth_fmt_005fmessage_005f6(_jspx_parent, _jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("            DataSourceEditDwr.getPoints(writePointList);\r\n");
      out.write("        }\r\n");
      out.write("        getAlarms();\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function toggleDataSource() {\r\n");
      out.write("        if (typeof toggleDataSourceImpl == 'function') toggleDataSourceImpl();\r\n");
      out.write("        \r\n");
      out.write("        var imgNode = $(\"dsStatusImg\");\r\n");
      out.write("        if (!hasImageFader(imgNode)) {\r\n");
      out.write("            DataSourceEditDwr.toggleEditDataSource(toggleDataSourceCB);\r\n");
      out.write("            startImageFader(imgNode);\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function toggleDataSourceCB(result) {\r\n");
      out.write("        var imgNode = $(\"dsStatusImg\");\r\n");
      out.write("        stopImageFader(imgNode);\r\n");
      out.write("        setDataSourceStatusImg(result.enabled, imgNode);\r\n");
      out.write("        getAlarms();\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function togglePoint(pointId) {\r\n");
      out.write("        DataSourceEditDwr.togglePoint(pointId, togglePointCB);\r\n");
      out.write("        startImageFader(\"toggleImg\"+ pointId, true);\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function togglePointCB(response) {\r\n");
      out.write("        stopImageFader(\"toggleImg\"+ response.data.id);\r\n");
      out.write("        writePointList(response.data.points);\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function deletePoint() {\r\n");
      out.write("        if (confirm(\"");
      if (_jspx_meth_fmt_005fmessage_005f7(_jspx_parent, _jspx_page_context))
        return;
      out.write("\")) {\r\n");
      out.write("            DataSourceEditDwr.deletePoint(currentPoint.id, deletePointCB);\r\n");
      out.write("            startImageFader(\"pointDeleteImg\", true);\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function deletePointCB(points) {\r\n");
      out.write("        stopImageFader(\"pointDeleteImg\");\r\n");
      out.write("        hide(\"pointDetails\");\r\n");
      out.write("        currentPoint = null;\r\n");
      out.write("        writePointList(points);\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function writePointList(points) {\r\n");
      out.write("        if (typeof writePointListImpl == 'function') writePointListImpl(points);\r\n");
      out.write("        \r\n");
      out.write("        if (!points)\r\n");
      out.write("            return;\r\n");
      out.write("        show(\"pointProperties\");\r\n");
      out.write("        show(\"alarmsTable\");\r\n");
      out.write("        show(\"dsStatusImg\");\r\n");
      out.write("    \r\n");
      out.write("        if (currentPoint)\r\n");
      out.write("            stopImageFader(\"editImg\"+ currentPoint.id);\r\n");
      out.write("        dwr.util.removeAllRows(\"pointsList\");\r\n");
      out.write("        dwr.util.addRows(\"pointsList\", points, pointListColumnFunctions, pointListOptions);\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function addPoint(ref) {\r\n");
      out.write("        if (!dojo.html.isShowing(\"pointProperties\")) {\r\n");
      out.write("            alert(\"");
      if (_jspx_meth_fmt_005fmessage_005f8(_jspx_parent, _jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("            return;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        if (currentPoint)\r\n");
      out.write("            stopImageFader(\"editImg\"+ currentPoint.id);\r\n");
      out.write("        \r\n");
      out.write("        startImageFader(\"editImg\"+ ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      boolean _jspx_th_c_005fout_005f0_reused = false;
      try {
        _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
        _jspx_th_c_005fout_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
        // /WEB-INF/jsp/dataSourceEdit.jsp(183,35) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fout_005f0.setValue(Common.NEW_ID);
        int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
        if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new SkipPageException();
        }
        _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
        _jspx_th_c_005fout_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f0, _jsp_annotationprocessor, _jspx_th_c_005fout_005f0_reused);
      }
      out.write(");\r\n");
      out.write("        hideContextualMessages(\"pointProperties\");\r\n");
      out.write("        \r\n");
      out.write("        addPointImpl(ref);\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function editPoint(pointId) {\r\n");
      out.write("        if (currentPoint)\r\n");
      out.write("            stopImageFader(\"editImg\"+ currentPoint.id);\r\n");
      out.write("        DataSourceEditDwr.getPoint(pointId, editPointCB);\r\n");
      out.write("        hideContextualMessages(\"pointProperties\");\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function editPointCB(point) {\r\n");
      out.write("        currentPoint = point;\r\n");
      out.write("        display(\"pointDeleteImg\", point.id != ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      boolean _jspx_th_c_005fout_005f1_reused = false;
      try {
        _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
        _jspx_th_c_005fout_005f1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
        // /WEB-INF/jsp/dataSourceEdit.jsp(198,46) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fout_005f1.setValue(Common.NEW_ID);
        int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
        if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new SkipPageException();
        }
        _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
        _jspx_th_c_005fout_005f1_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f1, _jsp_annotationprocessor, _jspx_th_c_005fout_005f1_reused);
      }
      out.write(");\r\n");
      out.write("        var locator = currentPoint.pointLocator;\r\n");
      out.write("        \r\n");
      out.write("        $set(\"name\", currentPoint.name);\r\n");
      out.write("        $set(\"xid\", currentPoint.xid);\r\n");
      out.write("        var cancel;\r\n");
      out.write("        if (typeof editPointCBImpl == 'function') cancel = editPointCBImpl(locator);\r\n");
      out.write("        if (!cancel) {\r\n");
      out.write("            startImageFader(\"editImg\"+ point.id);\r\n");
      out.write("            show(\"pointDetails\");\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function cancelEditPoint() {\r\n");
      out.write("        if (currentPoint) {\r\n");
      out.write("            stopImageFader(\"editImg\"+ currentPoint.id);\r\n");
      out.write("            currentPoint = null;\r\n");
      out.write("            hide(\"pointDetails\");\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function savePoint() {\r\n");
      out.write("        startImageFader(\"pointSaveImg\", true);\r\n");
      out.write("        hideContextualMessages(\"pointProperties\");\r\n");
      out.write("        var locator = currentPoint.pointLocator;\r\n");
      out.write("        \r\n");
      out.write("        // Prevents DWR warnings\r\n");
      out.write("        delete locator.configurationDescription;\r\n");
      out.write("        delete locator.dataTypeMessage;\r\n");
      out.write("        \r\n");
      out.write("        savePointImpl(locator);\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function savePointCB(response) {\r\n");
      out.write("        stopImageFader(\"pointSaveImg\");\r\n");
      out.write("        if (response.hasMessages)\r\n");
      out.write("            showDwrMessages(response.messages);\r\n");
      out.write("        else {\r\n");
      out.write("            writePointList(response.data.points);\r\n");
      out.write("            editPoint(response.data.id);\r\n");
      out.write("            showMessage(\"pointMessage\", \"");
      if (_jspx_meth_fmt_005fmessage_005f9(_jspx_parent, _jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function getAlarms() {\r\n");
      out.write("        DataSourceEditDwr.getAlarms(writeAlarms);\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function writeAlarms(alarms) {\r\n");
      out.write("        dwr.util.removeAllRows(\"alarmsList\");\r\n");
      out.write("        if (alarms.length == 0) {\r\n");
      out.write("            show(\"noAlarmsMsg\");\r\n");
      out.write("            hide(\"alarmsList\");\r\n");
      out.write("        }\r\n");
      out.write("        else {\r\n");
      out.write("            hide(\"noAlarmsMsg\");\r\n");
      out.write("            show(\"alarmsList\");\r\n");
      out.write("            dwr.util.addRows(\"alarmsList\", alarms, [\r\n");
      out.write("                    function(alarm) {\r\n");
      out.write("                        var div = document.createElement(\"div\");\r\n");
      out.write("                        var img = document.createElement(\"img\");\r\n");
      out.write("                        setAlarmLevelImg(alarm.alarmLevel, img);\r\n");
      out.write("                        div.appendChild(img);\r\n");
      out.write("                        \r\n");
      out.write("                        var span = document.createElement(\"span\");\r\n");
      out.write("                        span.innerHTML = alarm.prettyActiveTimestamp +\": \"+ alarm.message;\r\n");
      out.write("                        div.appendChild(span);\r\n");
      out.write("                        \r\n");
      out.write("                        return div; \r\n");
      out.write("                    }],\r\n");
      out.write("                    {\r\n");
      out.write("                        cellCreator: function(options) {\r\n");
      out.write("                            var td = document.createElement(\"td\");\r\n");
      out.write("                            td.className = \"formError\";\r\n");
      out.write("                            return td;\r\n");
      out.write("                        }\r\n");
      out.write("                    });\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function alarmLevelChanged(eventId) {\r\n");
      out.write("        var alarmLevel = $get(\"alarmLevel\"+ eventId);\r\n");
      out.write("        DataSourceEditDwr.updateEventAlarmLevel(eventId, alarmLevel);\r\n");
      out.write("        setAlarmLevelImg(alarmLevel, \"alarmLevelImg\"+ eventId);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function enableAllPoints() {\r\n");
      out.write("    \t startImageFader($(\"enableAllImg\"));\r\n");
      out.write("    \t DataSourceEditDwr.enableAllPoints(enableAllPointsCB);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function enableAllPointsCB(points) {\r\n");
      out.write("    \tstopImageFader($(\"enableAllImg\"));\r\n");
      out.write("    \twritePointList(points);\r\n");
      out.write("    }\r\n");
      out.write("  </script>\r\n");
      out.write("\r\n");
      out.write("\t<table class=\"borderDiv marB\" cellpadding=\"0\" cellspacing=\"0\"\r\n");
      out.write("\t\tid=\"alarmsTable\" style=\"display: none;\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<table width=\"100%\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"smallTitle\">");
      if (_jspx_meth_fmt_005fmessage_005f10(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"right\">");
      if (_jspx_meth_tag_005fimg_005f0(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr id=\"noAlarmsMsg\">\r\n");
      out.write("\t\t\t\t\t\t<td><b>");
      if (_jspx_meth_fmt_005fmessage_005f11(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</b>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tbody id=\"alarmsList\"></tbody>\r\n");
      out.write("\t\t\t\t</table></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\r\n");
      out.write("\t");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_parent, _jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      return;
    }
    public void invoke( java.io.Writer writer )
      throws JspException
    {
      JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        this.jspContext.getELContext().putContext(JspContext.class,this.jspContext);
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
        }
      }
      catch( Throwable e ) {
        if (e instanceof SkipPageException)
            throw (SkipPageException) e;
        throw new JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}
