
// Description: Java 11 MssCF Binding for ISOCtryCcy Column ISOCtryId.

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
 *	CFSecMssCFBindISOCtryCcyISOCtryId binds ISOCtryCcy.ISOCtryId
 *	as an instance of MssCFGenBindObj.
 */
public class CFSecMssCFBindISOCtryCcyISOCtryId
	extends MssCFGenBindObj
{
	private static final long serialVersionUID = 1L;

	public CFSecMssCFBindISOCtryCcyISOCtryId() {
		super();
	}

	public CFSecMssCFBindISOCtryCcyISOCtryId( MssCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"ISOCtryCcy",
			"ISOCtryId" );
	}
	public Object getValueObject( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFBindISOCtryCcyISOCtryId.getValueObject() ";

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

		short iSOCtryId;
		if( genDef instanceof ICFSecISOCtryCcyObj ) {
			iSOCtryId = ((ICFSecISOCtryCcyObj)genDef).getRequiredISOCtryId();
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"expandBody",
				"genContext.getGenDef()",
				genDef,
				"ICFSecISOCtryCcyObj" );
		}

		return( iSOCtryId );
	}

	public String expandBody( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFBindISOCtryCcyISOCtryId.expandBody() ";

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

		if( genDef instanceof ICFSecISOCtryCcyObj ) {
			short iSOCtryId = ((ICFSecISOCtryCcyObj)genDef).getRequiredISOCtryId();
			ret = Short.toString( iSOCtryId );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"expandBody",
				"genContext.getGenDef()",
				genDef,
				"ICFSecISOCtryCcyObj" );
		}

		return( ret );
	}

}
