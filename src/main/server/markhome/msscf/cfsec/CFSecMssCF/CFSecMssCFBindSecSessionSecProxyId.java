
// Description: Java 11 MssCF Binding for SecSession Column SecProxyId.

/*
 *	server.markhome.msscf.CFSec
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfsec.CFSecMssCF;

import java.math.*;
import java.sql.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import org.msscf.msscf.cfcore.MssCF.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import org.apache.commons.codec.binary.Base64;

/**
 *	CFSecMssCFBindSecSessionSecProxyId binds SecSession.SecProxyId
 *	as an instance of MssCFGenBindObj.
 */
public class CFSecMssCFBindSecSessionSecProxyId
	extends MssCFGenBindObj
{
	private static final long serialVersionUID = 1L;

	public CFSecMssCFBindSecSessionSecProxyId() {
		super();
	}

	public CFSecMssCFBindSecSessionSecProxyId( MssCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"SecSession",
			"SecProxyId" );
	}
	public Object getValueObject( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFBindSecSessionSecProxyId.getValueObject() ";

		if( genContext == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"expandBody",
				1,
				"genContext" );
		}

		ICFLibAnyObj genDef = genContext.getGenDef();
		if( genDef == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"expandBody",
				1,
				"genContext.getGenDef()" );
		}

		UUID secProxyId;
		if( genDef instanceof ICFSecSecSessionObj ) {
			secProxyId = ((ICFSecSecSessionObj)genDef).getOptionalSecProxyId();
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"expandBody",
				"genContext.getGenDef()",
				genDef,
				"ICFSecSecSessionObj" );
		}

		return( secProxyId );
	}

	public String expandBody( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFBindSecSessionSecProxyId.expandBody() ";

		if( genContext == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"expandBody",
				1,
				"genContext" );
		}

		ICFLibAnyObj genDef = genContext.getGenDef();
		if( genDef == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"expandBody",
				1,
				"genContext.getGenDef()" );
		}

		String ret;

		if( genDef instanceof ICFSecSecSessionObj ) {
			UUID secProxyId = ((ICFSecSecSessionObj)genDef).getOptionalSecProxyId();
			if( secProxyId == null ) {
				ret = null;
			}
			else {
				ret = secProxyId.toString();
			}
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"expandBody",
				"genContext.getGenDef()",
				genDef,
				"ICFSecSecSessionObj" );
		}

		return( ret );
	}

}
