package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dataSourceList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(7);
    _jspx_dependants.add("/WEB-INF/jsp/include/tech.jsp");
    _jspx_dependants.add("/WEB-INF/tld/mango.tld");
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
    _jspx_dependants.add("/WEB-INF/tags/page.tag");
    _jspx_dependants.add("/WEB-INF/tags/menuItem.tag");
    _jspx_dependants.add("/WEB-INF/tags/img.tag");
    _jspx_dependants.add("/WEB-INF/tags/help.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsst_005flistSort_0026_005fpaging_005flabelKey_005ffield_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems_005fend_005fbegin;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsst_005fi18n_0026_005fmessage_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsst_005fpageNumber_0026_005frowsLabelKey_005fpaging_005fpageLabelKey_005fofLabelKey_005fnoRowsLabelKey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsst_005fpagination_0026_005fpreviousLabelKey_005fpaging_005fnextLabelKey_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsst_005flistSort_0026_005fpaging_005flabelKey_005ffield_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems_005fend_005fbegin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsst_005fi18n_0026_005fmessage_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsst_005fpageNumber_0026_005frowsLabelKey_005fpaging_005fpageLabelKey_005fofLabelKey_005fnoRowsLabelKey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsst_005fpagination_0026_005fpreviousLabelKey_005fpaging_005fnextLabelKey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005fsst_005flistSort_0026_005fpaging_005flabelKey_005ffield_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems_005fend_005fbegin.release();
    _005fjspx_005ftagPool_005fsst_005fi18n_0026_005fmessage_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fsst_005fpageNumber_0026_005frowsLabelKey_005fpaging_005fpageLabelKey_005fofLabelKey_005fnoRowsLabelKey_005fnobody.release();
    _005fjspx_005ftagPool_005fsst_005fpagination_0026_005fpreviousLabelKey_005fpaging_005fnextLabelKey_005fnobody.release();
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
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_tag_005fpage_005f0(_jspx_page_context))
        return;
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

  private boolean _jspx_meth_tag_005fpage_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:page
    org.apache.jsp.tag.web.page_tag _jspx_th_tag_005fpage_005f0 = new org.apache.jsp.tag.web.page_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fpage_005f0);
    _jspx_th_tag_005fpage_005f0.setJspContext(_jspx_page_context);
    // /WEB-INF/jsp/dataSourceList.jsp(20,0) name = dwr type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fpage_005f0.setDwr("DataSourceListDwr");
    // /WEB-INF/jsp/dataSourceList.jsp(20,0) name = onload type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fpage_005f0.setOnload("init");
    _jspx_th_tag_005fpage_005f0.setJspBody(new Helper( 0, _jspx_page_context, _jspx_th_tag_005fpage_005f0, null));
    _jspx_th_tag_005fpage_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fpage_005f0);
    return false;
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
      // /WEB-INF/jsp/dataSourceList.jsp(60,21) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f0.setKey("dsList.dsDeleteConfirm");
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
      // /WEB-INF/jsp/dataSourceList.jsp(82,21) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f1.setKey("dsList.pointDeleteConfirm");
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

  private boolean _jspx_meth_tag_005fimg_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f0 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f0);
    _jspx_th_tag_005fimg_005f0.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f0.setParent(_jspx_parent);
    // /WEB-INF/jsp/dataSourceList.jsp(98,8) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f0.setPng("icon_ds");
    // /WEB-INF/jsp/dataSourceList.jsp(98,8) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f0.setTitle("dsList.dataSources");
    _jspx_th_tag_005fimg_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f0);
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
      // /WEB-INF/jsp/dataSourceList.jsp(99,33) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f2.setKey("dsList.dataSources");
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

  private boolean _jspx_meth_tag_005fhelp_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:help
    org.apache.jsp.tag.web.help_tag _jspx_th_tag_005fhelp_005f0 = new org.apache.jsp.tag.web.help_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fhelp_005f0);
    _jspx_th_tag_005fhelp_005f0.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fhelp_005f0.setParent(_jspx_parent);
    // /WEB-INF/jsp/dataSourceList.jsp(100,8) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fhelp_005f0.setId("dataSourceList");
    _jspx_th_tag_005fhelp_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fhelp_005f0);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f1 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f1);
    _jspx_th_tag_005fimg_005f1.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f1.setParent(_jspx_parent);
    // /WEB-INF/jsp/dataSourceList.jsp(104,8) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f1.setPng("icon_ds_add");
    // /WEB-INF/jsp/dataSourceList.jsp(104,8) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f1.setTitle("common.add");
    // /WEB-INF/jsp/dataSourceList.jsp(104,8) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f1.setOnclick("addDataSource()");
    _jspx_th_tag_005fimg_005f1.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f1);
    return false;
  }

  private boolean _jspx_meth_sst_005flistSort_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:listSort
    com.serotonin.web.taglib.ListSortTag _jspx_th_sst_005flistSort_005f0 = (com.serotonin.web.taglib.ListSortTag) _005fjspx_005ftagPool_005fsst_005flistSort_0026_005fpaging_005flabelKey_005ffield_005fnobody.get(com.serotonin.web.taglib.ListSortTag.class);
    boolean _jspx_th_sst_005flistSort_005f0_reused = false;
    try {
      _jspx_th_sst_005flistSort_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sst_005flistSort_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/dataSourceList.jsp(115,22) name = labelKey type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005flistSort_005f0.setLabelKey("dsList.name");
      // /WEB-INF/jsp/dataSourceList.jsp(115,22) name = field type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005flistSort_005f0.setField("name");
      // /WEB-INF/jsp/dataSourceList.jsp(115,22) name = paging type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005flistSort_005f0.setPaging((com.serotonin.web.util.PagingDataForm) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${paging}", com.serotonin.web.util.PagingDataForm.class, (PageContext)_jspx_page_context, null, false));
      int _jspx_eval_sst_005flistSort_005f0 = _jspx_th_sst_005flistSort_005f0.doStartTag();
      if (_jspx_th_sst_005flistSort_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fsst_005flistSort_0026_005fpaging_005flabelKey_005ffield_005fnobody.reuse(_jspx_th_sst_005flistSort_005f0);
      _jspx_th_sst_005flistSort_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sst_005flistSort_005f0, _jsp_annotationprocessor, _jspx_th_sst_005flistSort_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sst_005flistSort_005f1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:listSort
    com.serotonin.web.taglib.ListSortTag _jspx_th_sst_005flistSort_005f1 = (com.serotonin.web.taglib.ListSortTag) _005fjspx_005ftagPool_005fsst_005flistSort_0026_005fpaging_005flabelKey_005ffield_005fnobody.get(com.serotonin.web.taglib.ListSortTag.class);
    boolean _jspx_th_sst_005flistSort_005f1_reused = false;
    try {
      _jspx_th_sst_005flistSort_005f1.setPageContext(_jspx_page_context);
      _jspx_th_sst_005flistSort_005f1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/dataSourceList.jsp(116,22) name = labelKey type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005flistSort_005f1.setLabelKey("dsList.type");
      // /WEB-INF/jsp/dataSourceList.jsp(116,22) name = field type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005flistSort_005f1.setField("type");
      // /WEB-INF/jsp/dataSourceList.jsp(116,22) name = paging type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005flistSort_005f1.setPaging((com.serotonin.web.util.PagingDataForm) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${paging}", com.serotonin.web.util.PagingDataForm.class, (PageContext)_jspx_page_context, null, false));
      int _jspx_eval_sst_005flistSort_005f1 = _jspx_th_sst_005flistSort_005f1.doStartTag();
      if (_jspx_th_sst_005flistSort_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fsst_005flistSort_0026_005fpaging_005flabelKey_005ffield_005fnobody.reuse(_jspx_th_sst_005flistSort_005f1);
      _jspx_th_sst_005flistSort_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sst_005flistSort_005f1, _jsp_annotationprocessor, _jspx_th_sst_005flistSort_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sst_005flistSort_005f2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:listSort
    com.serotonin.web.taglib.ListSortTag _jspx_th_sst_005flistSort_005f2 = (com.serotonin.web.taglib.ListSortTag) _005fjspx_005ftagPool_005fsst_005flistSort_0026_005fpaging_005flabelKey_005ffield_005fnobody.get(com.serotonin.web.taglib.ListSortTag.class);
    boolean _jspx_th_sst_005flistSort_005f2_reused = false;
    try {
      _jspx_th_sst_005flistSort_005f2.setPageContext(_jspx_page_context);
      _jspx_th_sst_005flistSort_005f2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/dataSourceList.jsp(117,22) name = labelKey type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005flistSort_005f2.setLabelKey("dsList.connection");
      // /WEB-INF/jsp/dataSourceList.jsp(117,22) name = field type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005flistSort_005f2.setField("conn");
      // /WEB-INF/jsp/dataSourceList.jsp(117,22) name = paging type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005flistSort_005f2.setPaging((com.serotonin.web.util.PagingDataForm) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${paging}", com.serotonin.web.util.PagingDataForm.class, (PageContext)_jspx_page_context, null, false));
      int _jspx_eval_sst_005flistSort_005f2 = _jspx_th_sst_005flistSort_005f2.doStartTag();
      if (_jspx_th_sst_005flistSort_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fsst_005flistSort_0026_005fpaging_005flabelKey_005ffield_005fnobody.reuse(_jspx_th_sst_005flistSort_005f2);
      _jspx_th_sst_005flistSort_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sst_005flistSort_005f2, _jsp_annotationprocessor, _jspx_th_sst_005flistSort_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sst_005flistSort_005f3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:listSort
    com.serotonin.web.taglib.ListSortTag _jspx_th_sst_005flistSort_005f3 = (com.serotonin.web.taglib.ListSortTag) _005fjspx_005ftagPool_005fsst_005flistSort_0026_005fpaging_005flabelKey_005ffield_005fnobody.get(com.serotonin.web.taglib.ListSortTag.class);
    boolean _jspx_th_sst_005flistSort_005f3_reused = false;
    try {
      _jspx_th_sst_005flistSort_005f3.setPageContext(_jspx_page_context);
      _jspx_th_sst_005flistSort_005f3.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/dataSourceList.jsp(118,22) name = labelKey type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005flistSort_005f3.setLabelKey("dsList.status");
      // /WEB-INF/jsp/dataSourceList.jsp(118,22) name = field type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005flistSort_005f3.setField("enabled");
      // /WEB-INF/jsp/dataSourceList.jsp(118,22) name = paging type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005flistSort_005f3.setPaging((com.serotonin.web.util.PagingDataForm) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${paging}", com.serotonin.web.util.PagingDataForm.class, (PageContext)_jspx_page_context, null, false));
      int _jspx_eval_sst_005flistSort_005f3 = _jspx_th_sst_005flistSort_005f3.doStartTag();
      if (_jspx_th_sst_005flistSort_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fsst_005flistSort_0026_005fpaging_005flabelKey_005ffield_005fnobody.reuse(_jspx_th_sst_005flistSort_005f3);
      _jspx_th_sst_005flistSort_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sst_005flistSort_005f3, _jsp_annotationprocessor, _jspx_th_sst_005flistSort_005f3_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f0_reused = false;
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/dataSourceList.jsp(122,16) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("hideText");
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_eval_c_005fset_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_c_005fset_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_c_005fset_005f0);
        }
        do {
          if (_jspx_meth_fmt_005fmessage_005f3(_jspx_th_c_005fset_005f0, _jspx_page_context))
            return true;
          int evalDoAfterBody = _jspx_th_c_005fset_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_c_005fset_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.reuse(_jspx_th_c_005fset_005f0);
      _jspx_th_c_005fset_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_annotationprocessor, _jspx_th_c_005fset_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fset_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f3 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f3_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f3.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fset_005f0);
      // /WEB-INF/jsp/dataSourceList.jsp(122,38) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f3.setKey("dsList.hide");
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

  private boolean _jspx_meth_c_005fset_005f1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f1_reused = false;
    try {
      _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/dataSourceList.jsp(123,16) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f1.setVar("showText");
      int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
      if (_jspx_eval_c_005fset_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_c_005fset_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_c_005fset_005f1);
        }
        do {
          if (_jspx_meth_fmt_005fmessage_005f4(_jspx_th_c_005fset_005f1, _jspx_page_context))
            return true;
          int evalDoAfterBody = _jspx_th_c_005fset_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_c_005fset_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.reuse(_jspx_th_c_005fset_005f1);
      _jspx_th_c_005fset_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f1, _jsp_annotationprocessor, _jspx_th_c_005fset_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fset_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f4 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f4_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f4.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fset_005f1);
      // /WEB-INF/jsp/dataSourceList.jsp(123,38) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f4.setKey("dsList.show");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems_005fend_005fbegin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/dataSourceList.jsp(124,16) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${paging.data}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
      // /WEB-INF/jsp/dataSourceList.jsp(124,16) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("listParent");
      // /WEB-INF/jsp/dataSourceList.jsp(124,16) name = begin type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setBegin(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${paging.offset}", java.lang.Integer.class, (PageContext)_jspx_page_context, null, false)).intValue());
      // /WEB-INF/jsp/dataSourceList.jsp(124,16) name = end type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${paging.endIndex}", java.lang.Integer.class, (PageContext)_jspx_page_context, null, false)).intValue());
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                  <tr class=\"row\" id=\"dataSourceRow");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listParent.parent.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\">\r\n");
            out.write("                    <td><b>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listParent.parent.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</b></td>\r\n");
            out.write("                    <td>");
            if (_jspx_meth_fmt_005fmessage_005f5(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("</td>\r\n");
            out.write("                    <td>");
            if (_jspx_meth_sst_005fi18n_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("</td>\r\n");
            out.write("                    <td align=\"center\">\r\n");
            out.write("                      ");
            if (_jspx_meth_c_005fchoose_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("\r\n");
            out.write("                    </td>\r\n");
            out.write("                    <td>\r\n");
            out.write("                      <a href=\"data_source_edit.shtm?dsid=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listParent.parent.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write('"');
            out.write('>');
            if (_jspx_meth_tag_005fimg_005f4(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("</a>\r\n");
            out.write("                      ");
            if (_jspx_meth_tag_005fimg_005f5(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("\r\n");
            out.write("                      ");
            if (_jspx_meth_tag_005fimg_005f6(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("\r\n");
            out.write("                      ");
            if (_jspx_meth_tag_005fimg_005f7(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("\r\n");
            out.write("                    </td>\r\n");
            out.write("                  </tr>\r\n");
            out.write("                  \r\n");
            out.write("                  <tr id=\"points");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listParent.parent.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\" class=\"rowAlt2\" style=\"display:none\">\r\n");
            out.write("                    <td colspan=\"5\" style=\"padding:0px 0px 0px 30px;background-color:#FFFFFF;\">\r\n");
            out.write("                      <table cellspacing=\"1\" cellpadding=\"0\" border=\"0\">\r\n");
            out.write("                        <tr class=\"rowHeader\">\r\n");
            out.write("                          <td>");
            if (_jspx_meth_fmt_005fmessage_005f6(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("</td>\r\n");
            out.write("                          <td>");
            if (_jspx_meth_fmt_005fmessage_005f7(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("</td>\r\n");
            out.write("                          <td>");
            if (_jspx_meth_fmt_005fmessage_005f8(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("</td>\r\n");
            out.write("                          <td></td>\r\n");
            out.write("                        </tr>\r\n");
            out.write("                        ");
            if (_jspx_meth_c_005fforEach_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("\r\n");
            out.write("                      </table>\r\n");
            out.write("                    </td>\r\n");
            out.write("                  </tr>\r\n");
            out.write("                ");
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
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems_005fend_005fbegin.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_annotationprocessor, _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f5 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f5_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f5.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /WEB-INF/jsp/dataSourceList.jsp(127,24) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f5.setKey((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listParent.parent.type.key}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
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

  private boolean _jspx_meth_sst_005fi18n_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:i18n
    com.serotonin.web.taglib.LocalizableMessageTag _jspx_th_sst_005fi18n_005f0 = (com.serotonin.web.taglib.LocalizableMessageTag) _005fjspx_005ftagPool_005fsst_005fi18n_0026_005fmessage_005fnobody.get(com.serotonin.web.taglib.LocalizableMessageTag.class);
    boolean _jspx_th_sst_005fi18n_005f0_reused = false;
    try {
      _jspx_th_sst_005fi18n_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sst_005fi18n_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /WEB-INF/jsp/dataSourceList.jsp(128,24) name = message type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005fi18n_005f0.setMessage((com.serotonin.web.i18n.LocalizableMessage) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listParent.parent.connectionDescription}", com.serotonin.web.i18n.LocalizableMessage.class, (PageContext)_jspx_page_context, null, false));
      int _jspx_eval_sst_005fi18n_005f0 = _jspx_th_sst_005fi18n_005f0.doStartTag();
      if (_jspx_th_sst_005fi18n_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fsst_005fi18n_0026_005fmessage_005fnobody.reuse(_jspx_th_sst_005fi18n_005f0);
      _jspx_th_sst_005fi18n_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sst_005fi18n_005f0, _jsp_annotationprocessor, _jspx_th_sst_005fi18n_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f0_reused = false;
    try {
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        ");
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("                        ");
          if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("                      ");
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

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f0_reused = false;
    try {
      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/jsp/dataSourceList.jsp(131,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listParent.parent.enabled}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                          ");
          if (_jspx_meth_tag_005fimg_005f2(_jspx_th_c_005fwhen_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("                        ");
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

  private boolean _jspx_meth_tag_005fimg_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f2 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f2);
    _jspx_th_tag_005fimg_005f2.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f2.setParent(_jspx_th_c_005fwhen_005f0);
    // /WEB-INF/jsp/dataSourceList.jsp(132,26) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f2.setPng("database_go");
    // /WEB-INF/jsp/dataSourceList.jsp(132,26) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f2.setTitle("common.enabledToggle");
    // /WEB-INF/jsp/dataSourceList.jsp(132,26) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f2.setId((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("dsImg${listParent.parent.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/jsp/dataSourceList.jsp(132,26) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f2.setOnclick((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("toggleDataSource(${listParent.parent.id})", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_tag_005fimg_005f2.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
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
          out.write("\r\n");
          out.write("                          ");
          if (_jspx_meth_tag_005fimg_005f3(_jspx_th_c_005fotherwise_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("                        ");
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

  private boolean _jspx_meth_tag_005fimg_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f3 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f3);
    _jspx_th_tag_005fimg_005f3.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f3.setParent(_jspx_th_c_005fotherwise_005f0);
    // /WEB-INF/jsp/dataSourceList.jsp(136,26) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f3.setPng("database_stop");
    // /WEB-INF/jsp/dataSourceList.jsp(136,26) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f3.setTitle("common.disabledToggle");
    // /WEB-INF/jsp/dataSourceList.jsp(136,26) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f3.setId((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("dsImg${listParent.parent.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/jsp/dataSourceList.jsp(136,26) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f3.setOnclick((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("toggleDataSource(${listParent.parent.id})", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_tag_005fimg_005f3.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f3);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f4 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f4);
    _jspx_th_tag_005fimg_005f4.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f4.setParent(_jspx_th_c_005fforEach_005f0);
    // /WEB-INF/jsp/dataSourceList.jsp(142,83) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f4.setPng("icon_ds_edit");
    // /WEB-INF/jsp/dataSourceList.jsp(142,83) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f4.setTitle("common.edit");
    _jspx_th_tag_005fimg_005f4.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f4);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f5 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f5);
    _jspx_th_tag_005fimg_005f5.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f5.setParent(_jspx_th_c_005fforEach_005f0);
    // /WEB-INF/jsp/dataSourceList.jsp(144,22) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f5.setPng("arrow_out");
    // /WEB-INF/jsp/dataSourceList.jsp(144,22) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f5.setTitle("dsList.show");
    // /WEB-INF/jsp/dataSourceList.jsp(144,22) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f5.setOnclick((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("togglePanelVisibility2(this, 'points${listParent.parent.id}', '${hideText}', '${showText}');", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_tag_005fimg_005f5.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f5);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f6 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f6);
    _jspx_th_tag_005fimg_005f6.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f6.setParent(_jspx_th_c_005fforEach_005f0);
    // /WEB-INF/jsp/dataSourceList.jsp(145,22) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f6.setPng("icon_ds_delete");
    // /WEB-INF/jsp/dataSourceList.jsp(145,22) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f6.setTitle("common.delete");
    // /WEB-INF/jsp/dataSourceList.jsp(145,22) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f6.setId((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("deleteDataSourceImg${listParent.parent.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/jsp/dataSourceList.jsp(145,22) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f6.setOnclick((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("deleteDataSource(${listParent.parent.id})", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_tag_005fimg_005f6.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f6);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f7 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f7);
    _jspx_th_tag_005fimg_005f7.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f7.setParent(_jspx_th_c_005fforEach_005f0);
    // /WEB-INF/jsp/dataSourceList.jsp(147,22) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f7.setPng("icon_ds_add");
    // /WEB-INF/jsp/dataSourceList.jsp(147,22) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f7.setTitle("common.copy");
    // /WEB-INF/jsp/dataSourceList.jsp(147,22) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f7.setId((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("copyDataSourceImg${listParent.parent.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/jsp/dataSourceList.jsp(147,22) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f7.setOnclick((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("copyDataSource(${listParent.parent.id})", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_tag_005fimg_005f7.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f7);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f6 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f6_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f6.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /WEB-INF/jsp/dataSourceList.jsp(156,30) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f6.setKey("dsList.pointName");
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

  private boolean _jspx_meth_fmt_005fmessage_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f7 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f7_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f7.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /WEB-INF/jsp/dataSourceList.jsp(157,30) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f7.setKey("dsList.description");
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

  private boolean _jspx_meth_fmt_005fmessage_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f8 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f8_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f8.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /WEB-INF/jsp/dataSourceList.jsp(158,30) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f8.setKey("dsList.status");
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

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f1_reused = false;
    try {
      _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /WEB-INF/jsp/dataSourceList.jsp(161,24) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listParent.list}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
      // /WEB-INF/jsp/dataSourceList.jsp(161,24) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setVar("point");
      int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
        if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                          <tr id=\"pointRow");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${point.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\">\r\n");
            out.write("                            <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${point.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("                            <td>");
            if (_jspx_meth_sst_005fi18n_005f1(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
              return true;
            out.write(' ');
            out.write('/');
            out.write(' ');
            if (_jspx_meth_sst_005fi18n_005f2(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
              return true;
            out.write("</td>\r\n");
            out.write("                            <td align=\"center\">\r\n");
            out.write("                              ");
            if (_jspx_meth_c_005fchoose_005f1(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
              return true;
            out.write("\r\n");
            out.write("                            </td>\r\n");
            out.write("                            <td>");
            if (_jspx_meth_tag_005fimg_005f10(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
              return true;
            out.write("</td>\r\n");
            out.write("                            <td>");
            if (_jspx_meth_tag_005fimg_005f11(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
              return true;
            out.write("</td>\r\n");
            out.write("                          </tr>\r\n");
            out.write("                        ");
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

  private boolean _jspx_meth_sst_005fi18n_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:i18n
    com.serotonin.web.taglib.LocalizableMessageTag _jspx_th_sst_005fi18n_005f1 = (com.serotonin.web.taglib.LocalizableMessageTag) _005fjspx_005ftagPool_005fsst_005fi18n_0026_005fmessage_005fnobody.get(com.serotonin.web.taglib.LocalizableMessageTag.class);
    boolean _jspx_th_sst_005fi18n_005f1_reused = false;
    try {
      _jspx_th_sst_005fi18n_005f1.setPageContext(_jspx_page_context);
      _jspx_th_sst_005fi18n_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
      // /WEB-INF/jsp/dataSourceList.jsp(164,32) name = message type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005fi18n_005f1.setMessage((com.serotonin.web.i18n.LocalizableMessage) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${point.dataTypeMessage}", com.serotonin.web.i18n.LocalizableMessage.class, (PageContext)_jspx_page_context, null, false));
      int _jspx_eval_sst_005fi18n_005f1 = _jspx_th_sst_005fi18n_005f1.doStartTag();
      if (_jspx_th_sst_005fi18n_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fsst_005fi18n_0026_005fmessage_005fnobody.reuse(_jspx_th_sst_005fi18n_005f1);
      _jspx_th_sst_005fi18n_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sst_005fi18n_005f1, _jsp_annotationprocessor, _jspx_th_sst_005fi18n_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sst_005fi18n_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:i18n
    com.serotonin.web.taglib.LocalizableMessageTag _jspx_th_sst_005fi18n_005f2 = (com.serotonin.web.taglib.LocalizableMessageTag) _005fjspx_005ftagPool_005fsst_005fi18n_0026_005fmessage_005fnobody.get(com.serotonin.web.taglib.LocalizableMessageTag.class);
    boolean _jspx_th_sst_005fi18n_005f2_reused = false;
    try {
      _jspx_th_sst_005fi18n_005f2.setPageContext(_jspx_page_context);
      _jspx_th_sst_005fi18n_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
      // /WEB-INF/jsp/dataSourceList.jsp(164,81) name = message type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005fi18n_005f2.setMessage((com.serotonin.web.i18n.LocalizableMessage) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${point.configurationDescription}", com.serotonin.web.i18n.LocalizableMessage.class, (PageContext)_jspx_page_context, null, false));
      int _jspx_eval_sst_005fi18n_005f2 = _jspx_th_sst_005fi18n_005f2.doStartTag();
      if (_jspx_th_sst_005fi18n_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fsst_005fi18n_0026_005fmessage_005fnobody.reuse(_jspx_th_sst_005fi18n_005f2);
      _jspx_th_sst_005fi18n_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sst_005fi18n_005f2, _jsp_annotationprocessor, _jspx_th_sst_005fi18n_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f1_reused = false;
    try {
      _jspx_th_c_005fchoose_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
      int _jspx_eval_c_005fchoose_005f1 = _jspx_th_c_005fchoose_005f1.doStartTag();
      if (_jspx_eval_c_005fchoose_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                ");
          if (_jspx_meth_c_005fwhen_005f1(_jspx_th_c_005fchoose_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write("\r\n");
          out.write("                                ");
          if (_jspx_meth_c_005fotherwise_005f1(_jspx_th_c_005fchoose_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write("\r\n");
          out.write("                              ");
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f1);
      _jspx_th_c_005fchoose_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f1, _jsp_annotationprocessor, _jspx_th_c_005fchoose_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f1_reused = false;
    try {
      _jspx_th_c_005fwhen_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
      // /WEB-INF/jsp/dataSourceList.jsp(167,32) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${point.enabled}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
      if (_jspx_eval_c_005fwhen_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                  ");
          if (_jspx_meth_tag_005fimg_005f8(_jspx_th_c_005fwhen_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write("\r\n");
          out.write("                                ");
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

  private boolean _jspx_meth_tag_005fimg_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f8 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f8);
    _jspx_th_tag_005fimg_005f8.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f8.setParent(_jspx_th_c_005fwhen_005f1);
    // /WEB-INF/jsp/dataSourceList.jsp(168,34) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f8.setPng("brick_go");
    // /WEB-INF/jsp/dataSourceList.jsp(168,34) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f8.setTitle("common.enabledToggle");
    // /WEB-INF/jsp/dataSourceList.jsp(168,34) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f8.setId((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("dpImg${point.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/jsp/dataSourceList.jsp(168,34) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f8.setOnclick((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("toggleDataPoint(${point.id})", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_tag_005fimg_005f8.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f8);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    boolean _jspx_th_c_005fotherwise_005f1_reused = false;
    try {
      _jspx_th_c_005fotherwise_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fotherwise_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
      int _jspx_eval_c_005fotherwise_005f1 = _jspx_th_c_005fotherwise_005f1.doStartTag();
      if (_jspx_eval_c_005fotherwise_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                  ");
          if (_jspx_meth_tag_005fimg_005f9(_jspx_th_c_005fotherwise_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write("\r\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_005fotherwise_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fotherwise_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f1);
      _jspx_th_c_005fotherwise_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fotherwise_005f1, _jsp_annotationprocessor, _jspx_th_c_005fotherwise_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f9 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f9);
    _jspx_th_tag_005fimg_005f9.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f9.setParent(_jspx_th_c_005fotherwise_005f1);
    // /WEB-INF/jsp/dataSourceList.jsp(172,34) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f9.setPng("brick_stop");
    // /WEB-INF/jsp/dataSourceList.jsp(172,34) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f9.setTitle("common.disabledToggle");
    // /WEB-INF/jsp/dataSourceList.jsp(172,34) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f9.setId((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("dpImg${point.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/jsp/dataSourceList.jsp(172,34) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f9.setOnclick((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("toggleDataPoint(${point.id})", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_tag_005fimg_005f9.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f9);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f10 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f10);
    _jspx_th_tag_005fimg_005f10.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f10.setParent(_jspx_th_c_005fforEach_005f1);
    // /WEB-INF/jsp/dataSourceList.jsp(177,32) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f10.setPng("icon_comp");
    // /WEB-INF/jsp/dataSourceList.jsp(177,32) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f10.setTitle("events.pointDetails");
    // /WEB-INF/jsp/dataSourceList.jsp(177,32) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f10.setOnclick((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("window.location='data_point_details.shtm?dpid=${point.id}'", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_tag_005fimg_005f10.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f10);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f11 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f11);
    _jspx_th_tag_005fimg_005f11.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f11.setParent(_jspx_th_c_005fforEach_005f1);
    // /WEB-INF/jsp/dataSourceList.jsp(179,32) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f11.setPng("icon_comp_edit");
    // /WEB-INF/jsp/dataSourceList.jsp(179,32) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f11.setTitle("pointEdit.props.props");
    // /WEB-INF/jsp/dataSourceList.jsp(179,32) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f11.setOnclick((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("window.location='data_point_edit.shtm?dpid=${point.id}'", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_tag_005fimg_005f11.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f11);
    return false;
  }

  private boolean _jspx_meth_sst_005fpageNumber_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:pageNumber
    com.serotonin.web.taglib.PageNumberTag _jspx_th_sst_005fpageNumber_005f0 = (com.serotonin.web.taglib.PageNumberTag) _005fjspx_005ftagPool_005fsst_005fpageNumber_0026_005frowsLabelKey_005fpaging_005fpageLabelKey_005fofLabelKey_005fnoRowsLabelKey_005fnobody.get(com.serotonin.web.taglib.PageNumberTag.class);
    boolean _jspx_th_sst_005fpageNumber_005f0_reused = false;
    try {
      _jspx_th_sst_005fpageNumber_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sst_005fpageNumber_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/dataSourceList.jsp(191,16) name = paging type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005fpageNumber_005f0.setPaging((com.serotonin.web.util.PagingDataForm) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${paging}", com.serotonin.web.util.PagingDataForm.class, (PageContext)_jspx_page_context, null, false));
      // /WEB-INF/jsp/dataSourceList.jsp(191,16) name = pageLabelKey type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005fpageNumber_005f0.setPageLabelKey("pagination.page");
      // /WEB-INF/jsp/dataSourceList.jsp(191,16) name = ofLabelKey type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005fpageNumber_005f0.setOfLabelKey("pagination.of");
      // /WEB-INF/jsp/dataSourceList.jsp(191,16) name = rowsLabelKey type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005fpageNumber_005f0.setRowsLabelKey("pagination.rows");
      // /WEB-INF/jsp/dataSourceList.jsp(191,16) name = noRowsLabelKey type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005fpageNumber_005f0.setNoRowsLabelKey("pagination.noRows");
      int _jspx_eval_sst_005fpageNumber_005f0 = _jspx_th_sst_005fpageNumber_005f0.doStartTag();
      if (_jspx_th_sst_005fpageNumber_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fsst_005fpageNumber_0026_005frowsLabelKey_005fpaging_005fpageLabelKey_005fofLabelKey_005fnoRowsLabelKey_005fnobody.reuse(_jspx_th_sst_005fpageNumber_005f0);
      _jspx_th_sst_005fpageNumber_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sst_005fpageNumber_005f0, _jsp_annotationprocessor, _jspx_th_sst_005fpageNumber_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sst_005fpagination_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:pagination
    com.serotonin.web.taglib.PaginationTag _jspx_th_sst_005fpagination_005f0 = (com.serotonin.web.taglib.PaginationTag) _005fjspx_005ftagPool_005fsst_005fpagination_0026_005fpreviousLabelKey_005fpaging_005fnextLabelKey_005fnobody.get(com.serotonin.web.taglib.PaginationTag.class);
    boolean _jspx_th_sst_005fpagination_005f0_reused = false;
    try {
      _jspx_th_sst_005fpagination_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sst_005fpagination_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/dataSourceList.jsp(193,30) name = paging type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005fpagination_005f0.setPaging((com.serotonin.web.util.PagingDataForm) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${paging}", com.serotonin.web.util.PagingDataForm.class, (PageContext)_jspx_page_context, null, false));
      // /WEB-INF/jsp/dataSourceList.jsp(193,30) name = previousLabelKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005fpagination_005f0.setPreviousLabelKey("pagination.previous");
      // /WEB-INF/jsp/dataSourceList.jsp(193,30) name = nextLabelKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005fpagination_005f0.setNextLabelKey("pagination.next");
      int _jspx_eval_sst_005fpagination_005f0 = _jspx_th_sst_005fpagination_005f0.doStartTag();
      if (_jspx_th_sst_005fpagination_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fsst_005fpagination_0026_005fpreviousLabelKey_005fpaging_005fnextLabelKey_005fnobody.reuse(_jspx_th_sst_005fpagination_005f0);
      _jspx_th_sst_005fpagination_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sst_005fpagination_005f0, _jsp_annotationprocessor, _jspx_th_sst_005fpagination_005f0_reused);
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
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("  <script>\r\n");
      out.write("    function init() {\r\n");
      out.write("        DataSourceListDwr.init(function(response) {\r\n");
      out.write("            if (response.data.types) {\r\n");
      out.write("                dwr.util.addOptions(\"dataSourceTypes\", response.data.types, \"key\", \"value\");\r\n");
      out.write("                show(\"dataSourceTypesContent\");\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function toggleDataSource(dataSourceId) {\r\n");
      out.write("        var imgNode = $(\"dsImg\"+ dataSourceId);\r\n");
      out.write("        if (!hasImageFader(imgNode)) {\r\n");
      out.write("            DataSourceListDwr.toggleDataSource(dataSourceId, function(result) {\r\n");
      out.write("                updateStatusImg($(\"dsImg\"+ result.id), result.enabled, true);\r\n");
      out.write("            });\r\n");
      out.write("            startImageFader(imgNode);\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function toggleDataPoint(dataPointId) {\r\n");
      out.write("        var imgNode = $(\"dpImg\"+ dataPointId);\r\n");
      out.write("        if (!hasImageFader(imgNode)) {\r\n");
      out.write("            DataSourceListDwr.toggleDataPoint(dataPointId, function(result) {\r\n");
      out.write("                updateStatusImg($(\"dpImg\"+ result.data.id), result.data.enabled, false);\r\n");
      out.write("            });\r\n");
      out.write("            startImageFader(imgNode);\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function updateStatusImg(imgNode, enabled, ds) {\r\n");
      out.write("        stopImageFader(imgNode);\r\n");
      out.write("        if (ds)\r\n");
      out.write("            setDataSourceStatusImg(enabled, imgNode);\r\n");
      out.write("        else\r\n");
      out.write("            setDataPointStatusImg(enabled, imgNode);\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function deleteDataSource(dataSourceId) {\r\n");
      out.write("        if (confirm(\"");
      if (_jspx_meth_fmt_005fmessage_005f0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\")) {\r\n");
      out.write("            startImageFader(\"deleteDataSourceImg\"+ dataSourceId);\r\n");
      out.write("            DataSourceListDwr.deleteDataSource(dataSourceId, function(dataSourceId) {\r\n");
      out.write("                stopImageFader(\"deleteDataSourceImg\"+ dataSourceId);\r\n");
      out.write("                // Delete the data source row\r\n");
      out.write("                var row = $(\"dataSourceRow\"+ dataSourceId);\r\n");
      out.write("                row.parentNode.removeChild(row);\r\n");
      out.write("                // Delete the points section.\r\n");
      out.write("                row = $(\"points\"+ dataSourceId);\r\n");
      out.write("                row.parentNode.removeChild(row);\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function copyDataSource(fromDataSourceId) {\r\n");
      out.write("        startImageFader(\"copyDataSourceImg\"+ fromDataSourceId);\r\n");
      out.write("        DataSourceListDwr.copyDataSource(fromDataSourceId, function(toDataSourceId) {\r\n");
      out.write("            window.location = \"data_source_edit.shtm?dsid=\"+ toDataSourceId;\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function deleteDataPoint(pointId) {\r\n");
      out.write("        if (confirm(\"");
      if (_jspx_meth_fmt_005fmessage_005f1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\")) {\r\n");
      out.write("            DataSourceListDwr.deleteDataPoint(pointId, function(pointId) {\r\n");
      out.write("                var row = $(\"pointRow\"+ pointId);\r\n");
      out.write("                row.parentNode.removeChild(row);\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function addDataSource() {\r\n");
      out.write("        window.location = \"data_source_edit.shtm?typeId=\"+ $get(\"dataSourceTypes\");\r\n");
      out.write("    }\r\n");
      out.write("  </script>\r\n");
      out.write("  \r\n");
      out.write("  <table cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>\r\n");
      out.write("        ");
      if (_jspx_meth_tag_005fimg_005f0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("        <span class=\"smallTitle\">");
      if (_jspx_meth_fmt_005fmessage_005f2(_jspx_parent, _jspx_page_context))
        return true;
      out.write("</span>\r\n");
      out.write("        ");
      if (_jspx_meth_tag_005fhelp_005f0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("      </td>\r\n");
      out.write("      <td align=\"right\" id=\"dataSourceTypesContent\" style=\"display:none\">\r\n");
      out.write("        <select id=\"dataSourceTypes\"></select>\r\n");
      out.write("        ");
      if (_jspx_meth_tag_005fimg_005f1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    \r\n");
      out.write("    <tr>\r\n");
      out.write("      <td colspan=\"2\">\r\n");
      out.write("        <table cellspacing=\"0\" cellpadding=\"0\" border=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td colspan=\"2\">\r\n");
      out.write("              <table cellspacing=\"1\" cellpadding=\"0\" border=\"0\">\r\n");
      out.write("                <tr class=\"rowHeader\">\r\n");
      out.write("                  <td>");
      if (_jspx_meth_sst_005flistSort_005f0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("</td>\r\n");
      out.write("                  <td>");
      if (_jspx_meth_sst_005flistSort_005f1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("</td>\r\n");
      out.write("                  <td>");
      if (_jspx_meth_sst_005flistSort_005f2(_jspx_parent, _jspx_page_context))
        return true;
      out.write("</td>\r\n");
      out.write("                  <td>");
      if (_jspx_meth_sst_005flistSort_005f3(_jspx_parent, _jspx_page_context))
        return true;
      out.write("</td>\r\n");
      out.write("                  <td></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                \r\n");
      out.write("                ");
      if (_jspx_meth_c_005fset_005f0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("                ");
      if (_jspx_meth_c_005fset_005f1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("                ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("              </table>\r\n");
      out.write("            </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>");
      if (_jspx_meth_sst_005fpageNumber_005f0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("</td>\r\n");
      out.write("            <td align=\"right\">");
      if (_jspx_meth_sst_005fpagination_005f0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table>  \r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      return false;
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
